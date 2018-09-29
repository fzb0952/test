package com.fan.image.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fan.image.bean.TRight;
import com.fan.image.bean.TRightExample;

public interface TRightMapper {
    int countByExample(TRightExample example);

    int deleteByExample(TRightExample example);

    int insert(TRight record);

    int insertSelective(TRight record);

    List<TRight> selectByExample(TRightExample example);

    int updateByExampleSelective(@Param("record") TRight record, @Param("example") TRightExample example);

    int updateByExample(@Param("record") TRight record, @Param("example") TRightExample example);
}