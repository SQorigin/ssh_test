package com.ujiuye.auth.mapper;

import com.ujiuye.auth.bean.RoleSources;
import com.ujiuye.auth.bean.RoleSourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleSourcesMapper {
    int countByExample(RoleSourcesExample example);

    int deleteByExample(RoleSourcesExample example);

    int insert(RoleSources record);

    int insertSelective(RoleSources record);

    List<RoleSources> selectByExample(RoleSourcesExample example);

    int updateByExampleSelective(@Param("record") RoleSources record, @Param("example") RoleSourcesExample example);

    int updateByExample(@Param("record") RoleSources record, @Param("example") RoleSourcesExample example);
}