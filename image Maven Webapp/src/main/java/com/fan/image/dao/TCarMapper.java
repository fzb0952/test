package com.fan.image.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fan.image.bean.TCar;
import com.fan.image.bean.TCarExample;

public interface TCarMapper {
    int countByExample(TCarExample example);

    int deleteByExample(TCarExample example);

    int insert(TCar record);

    int insertSelective(TCar record);

    List<TCar> selectByExample(TCarExample example);

    int updateByExampleSelective(@Param("record") TCar record, @Param("example") TCarExample example);

    int updateByExample(@Param("record") TCar record, @Param("example") TCarExample example);
}