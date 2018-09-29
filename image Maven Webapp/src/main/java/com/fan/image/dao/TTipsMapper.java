package com.fan.image.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fan.image.bean.TTips;
import com.fan.image.bean.TTipsExample;

public interface TTipsMapper {
    int countByExample(TTipsExample example);

    int deleteByExample(TTipsExample example);

    int insert(TTips record);

    int insertSelective(TTips record);

    List<TTips> selectByExample(TTipsExample example);

    int updateByExampleSelective(@Param("record") TTips record, @Param("example") TTipsExample example);

    int updateByExample(@Param("record") TTips record, @Param("example") TTipsExample example);
}