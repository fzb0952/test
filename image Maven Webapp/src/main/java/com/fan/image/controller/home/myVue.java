/*
 * @Title: myVue.java
 * @Package com.fan.image.home
 * @Description: TODO 
 * Copyright 2018 Thuisoft, Inc. All rights reserved.
 * 
 * @author Administrator
 * @date 2018年8月7日
 */
package com.fan.image.controller.home;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fan.image.bean.TGoods;
import com.fan.image.service.IGoodsService;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * ClassName: myVue 
 * @Description: TODO
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年8月7日
 */
@Controller
public class myVue {
    
    @Autowired
    IGoodsService iGoodsService;    

    @RequestMapping("/getAllGoods")
    @ResponseBody
    public HashMap<String, Object> getAllGood(){
    	HashMap<String, Object> re=new HashMap<String,Object>();
    	HashMap<String, Object> re1=new HashMap<String,Object>();
    	re.put("totlal", "3");
    	re.put("page", "1");
    	re.put("records", "30");
    	re1.put("id","0");
    	re1.put("cell", iGoodsService.getAllGoods().get(1).toString());
    	re.put("row",re1);
    	
        return re;
    }
}
