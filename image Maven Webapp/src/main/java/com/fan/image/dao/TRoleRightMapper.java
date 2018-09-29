package com.fan.image.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fan.image.bean.TRoleRight;
import com.fan.image.bean.TRoleRightExample;

public interface TRoleRightMapper {
    int countByExample(TRoleRightExample example);

    int deleteByExample(TRoleRightExample example);

    int insert(TRoleRight record);

    int insertSelective(TRoleRight record);

    List<TRoleRight> selectByExample(TRoleRightExample example);

    int updateByExampleSelective(@Param("record") TRoleRight record, @Param("example") TRoleRightExample example);

    int updateByExample(@Param("record") TRoleRight record, @Param("example") TRoleRightExample example);
}