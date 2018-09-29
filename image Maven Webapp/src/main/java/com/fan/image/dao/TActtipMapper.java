package com.fan.image.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fan.image.bean.TActtip;
import com.fan.image.bean.TActtipExample;

public interface TActtipMapper {
    int countByExample(TActtipExample example);

    int deleteByExample(TActtipExample example);

    int insert(TActtip record);

    int insertSelective(TActtip record);

    List<TActtip> selectByExample(TActtipExample example);

    int updateByExampleSelective(@Param("record") TActtip record, @Param("example") TActtipExample example);

    int updateByExample(@Param("record") TActtip record, @Param("example") TActtipExample example);
}