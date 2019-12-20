package com.ujiuye.usual.mapper;

import com.ujiuye.usual.bean.Comparison;
import com.ujiuye.usual.bean.ComparisonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComparisonMapper {
    int countByExample(ComparisonExample example);

    int deleteByExample(ComparisonExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Comparison record);

    int insertSelective(Comparison record);

    List<Comparison> selectByExample(ComparisonExample example);

    Comparison selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Comparison record, @Param("example") ComparisonExample example);

    int updateByExample(@Param("record") Comparison record, @Param("example") ComparisonExample example);

    int updateByPrimaryKeySelective(Comparison record);

    int updateByPrimaryKey(Comparison record);
}