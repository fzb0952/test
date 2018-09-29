/*
 * @Title: IGoodsService.java
 * @Package com.fan.image.service
 * @Description: TODO 
 * Copyright 2018 Thuisoft, Inc. All rights reserved.
 * 
 * @author Administrator
 * @date 2018年8月7日
 */
package com.fan.image.service;

import java.util.List;

import com.fan.image.bean.TGoods;

/**
 * ClassName: IGoodsService 
 * @Description: TODO
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年8月7日
 */
public interface IGoodsService {

    /**
     * 
     * Description: 获取全部商品信息   
     * @return: List<TGoods>  
     * @author fanzhongbo
     * @date 2018年8月7日
     */
    public List<TGoods> getAllGoods();
}
