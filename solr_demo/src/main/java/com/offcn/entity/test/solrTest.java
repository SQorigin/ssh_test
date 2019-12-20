package com.offcn.entity.test;

import com.offcn.entity.TbItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.TermsOptions;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-sorl.xml")
public class solrTest {

    @Autowired
    private SolrTemplate solrTemplate;

    @Test
    public void add() {
        List<TbItem> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            TbItem item = new TbItem();
            item.setId(new Long(i));
            if (i % 4 == 0) {
                item.setTitle("三体舰队穿梭舰c-01" + i);
                item.setBrand("拾柒");
                item.setCategory("星际虫洞穿梭");
                item.setPrice(new BigDecimal(3000 + i));
                item.setSeller("虫洞研究所");
            } else if (i % 4 == 1) {
                item.setTitle("三体舰队光速舰c-01" + i);
                item.setBrand("拾柒");
                item.setCategory("星际虫洞穿梭");
                item.setPrice(new BigDecimal((3000 + new Random().nextInt(1000))));
                item.setSeller("虫洞研究所");
            } else if (i % 4 == 2) {
                item.setTitle("三体舰队补给舰c-01" + i);
                item.setBrand("拾柒");
                item.setCategory("星际虫洞穿梭");
                item.setPrice(new BigDecimal((3000 + new Random().nextInt(1000))));
                item.setSeller("虫洞研究所");

            } else if (i % 4 == 3) {
                item.setTitle("三体舰队幸子舰c-01" + i);
                item.setBrand("拾柒");
                item.setCategory("星际虫洞穿梭");
                item.setPrice(new BigDecimal(3000 + new Random().nextInt(1000)));
                item.setSeller("虫洞研究所");
                list.add(item);
            }
            //保存对象
            solrTemplate.saveBean(item);
        }
        solrTemplate.commit();
    }

    @Test
    public void findOne() {
        TbItem item = solrTemplate.getById(1, TbItem.class);
        System.out.println(item);
    }

    //默认查询分页 每页10条
    @Test
    public void findPage() {
        SimpleQuery simpleQuery = new SimpleQuery("*:*");
        ScoredPage<TbItem> items = solrTemplate.queryForPage(simpleQuery, TbItem.class);
        System.out.println("=========数据共有=========" + items.getTotalElements() + "条");
        List<TbItem> content = items.getContent();
        for (TbItem item : content) {
            System.out.println(item);
        }
    }

    //条件查询
    @Test
    public void findPage1() {
        SimpleQuery simpleQuery = new SimpleQuery("*:*");
        //查询条件
        Criteria criteria = new Criteria("item_title").contains("补给");
        simpleQuery.addCriteria(criteria);
        // simpleQuery.getOffset();
        ScoredPage<TbItem> items = solrTemplate.queryForPage(simpleQuery, TbItem.class);
        System.out.println("=========数据共有=========" + items.getTotalElements() + "条");
        List<TbItem> content = items.getContent();
        for (TbItem item : content) {
            System.out.println(item);
        }
    }

    //查询排序
    @Test
    public void findPage2() {
        SimpleQuery simpleQuery = new SimpleQuery("*:*");
        //查询条件
        Criteria criteria = new Criteria("item_title").contains("补给");
        criteria = criteria.and("item_price").greaterThan(3500);
        //创建排序使用的对象
        Sort sort = new Sort(Sort.Direction.ASC, "item_price");
        simpleQuery.addCriteria(criteria);
        // simpleQuery.getOffset();
        ScoredPage<TbItem> items = solrTemplate.queryForPage(simpleQuery, TbItem.class);
        System.out.println("=========数据共有=========" + items.getTotalElements() + "条");
        List<TbItem> content = items.getContent();
        for (TbItem item : content) {
            System.out.println(item);
        }
    }

    @Test
    public void delete() {
        SimpleQuery query = new SimpleQuery("*:*");
        //使用消息中间件时的测试
        Criteria criteria = new Criteria("item_title").is("天师");
        query.addCriteria(criteria);
        solrTemplate.delete(query);
        solrTemplate.commit();
    }
}

