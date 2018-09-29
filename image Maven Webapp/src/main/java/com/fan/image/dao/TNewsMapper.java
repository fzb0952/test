package com.fan.image.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fan.image.bean.TNews;
import com.fan.image.bean.TNewsExample;

public interface TNewsMapper {
    int countByExample(TNewsExample example);

    int deleteByExample(TNewsExample example);

    int insert(TNews record);

    int insertSelective(TNews record);

    List<TNews> selectByExample(TNewsExample example);

    int updateByExampleSelective(@Param("record") TNews record, @Param("example") TNewsExample example);

    int updateByExample(@Param("record") TNews record, @Param("example") TNewsExample example);
}