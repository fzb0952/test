package com.fan.image.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fan.image.bean.TUser;
import com.fan.image.bean.TUserExample;

public interface TUserMapper {
    int countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);
}