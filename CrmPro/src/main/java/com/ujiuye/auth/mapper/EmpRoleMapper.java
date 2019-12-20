package com.ujiuye.auth.mapper;

import com.ujiuye.auth.bean.EmpRole;
import com.ujiuye.auth.bean.EmpRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpRoleMapper {
    int countByExample(EmpRoleExample example);

    int deleteByExample(EmpRoleExample example);

    int insert(EmpRole record);

    int insertSelective(EmpRole record);

    List<EmpRole> selectByExample(EmpRoleExample example);

    int updateByExampleSelective(@Param("record") EmpRole record, @Param("example") EmpRoleExample example);

    int updateByExample(@Param("record") EmpRole record, @Param("example") EmpRoleExample example);
}