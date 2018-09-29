/*
 * @Title: GoodsServiceImpl.java
 * @Package com.fan.image.service.impl
 * @Description: TODO 
 * Copyright 2018 Thuisoft, Inc. All rights reserved.
 * 
 * @author Administrator
 * @date 2018年8月7日
 */
package com.fan.image.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fan.image.bean.TGoods;
import com.fan.image.dao.TGoodsMapper;
import com.fan.image.service.IGoodsService;

/**
 * ClassName: GoodsServiceImpl 
 * @Description: TODO
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年8月7日
 */
@Service
public class GoodsServiceImpl implements IGoodsService{

    @Autowired
    TGoodsMapper tGoodsMapper;
    /**
     * 获取全部商品信息
     */
    @Override
    public List<TGoods> getAllGoods() {
        return tGoodsMapper.getAllGoods();
    }
    
    
}
