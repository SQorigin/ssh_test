package com.offcn.entity.test;

import com.alibaba.fastjson.JSON;
import com.offcn.entity.TbItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.*;
import org.springframework.data.solr.core.query.result.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-sorl.xml")
public class SolrHigthLighting {

    @Autowired
    private SolrTemplate solrTemplate;

    @Test
    public void findByHightLighting() {
        //创建支持高亮的查询对象
        HighlightQuery query = new SimpleHighlightQuery();
        //创建一个用于设置高亮参数的options对象
        HighlightOptions options = new HighlightOptions();
        options.addField("item_title");
        options.setSimplePrefix("<em style='color:red'>");
        options.setSimplePostfix("</em>");
        query.setHighlightOptions(options);
        //创建查询条件 执行高亮查询
        Criteria criteria = new Criteria("item_keywords").is("三星");
        query.addCriteria(criteria);
        //使用模板调用高亮查询
        HighlightPage<TbItem> highlightPage = solrTemplate.queryForHighlightPage(query, TbItem.class);
        System.out.println(JSON.toJSONString(highlightPage));

        //包含查询结果的集合和高亮结果集合的对象
        List<HighlightEntry<TbItem>> highlighted = highlightPage.getHighlighted();
        //highLightEntry包含每个item和每个item高亮设置的对象
        for (HighlightEntry<TbItem> highlightEntry : highlighted) {
            TbItem item = highlightEntry.getEntity();
            //判断item对应的高亮数组是否存在 若存在就一层层取
            if (highlightEntry.getHighlights() != null & highlightEntry.getHighlights().size() > 0) {
                if (highlightEntry.getHighlights().get(0).getSnipplets() != null &&
                        highlightEntry.getHighlights().get(0).getSnipplets().size() > 0) {
                    item.setTitle(highlightEntry.getHighlights().get(0).getSnipplets().get(0));
                }
            }
        }
        //循环赋予title之后 获取item的list集合
        System.out.println(JSON.toJSONString(highlightPage.getContent()));

    }

    //分组查询
    @Test
    public void findByGroup() {
        SimpleQuery query = new SimpleQuery("item_keywords:联想");
        //设置分组对象
        GroupOptions options = new GroupOptions();
        options.addGroupByField("item_category");
        query.setGroupOptions(options);
        GroupPage<TbItem> groupPage = solrTemplate.queryForGroupPage(query, TbItem.class);
        GroupResult<TbItem> groupResult = groupPage.getGroupResult("item_category");
        System.out.println(JSON.toJSONString(groupResult));

        //获取分组集合的首对象
        Page<GroupEntry<TbItem>> groupEntries = groupResult.getGroupEntries();
        //取出content中的value
        List<GroupEntry<TbItem>> contents = groupEntries.getContent();
        for (GroupEntry<TbItem> content : contents) {
            System.out.println(content.getGroupValue());
        }
    }

}
