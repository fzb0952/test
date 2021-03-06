package com.fan.image.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fan.image.bean.TOrder;
import com.fan.image.bean.TOrderExample;

public interface TOrderMapper {
    int countByExample(TOrderExample example);

    int deleteByExample(TOrderExample example);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    List<TOrder> selectByExample(TOrderExample example);

    int updateByExampleSelective(@Param("record") TOrder record, @Param("example") TOrderExample example);

    int updateByExample(@Param("record") TOrder record, @Param("example") TOrderExample example);
}