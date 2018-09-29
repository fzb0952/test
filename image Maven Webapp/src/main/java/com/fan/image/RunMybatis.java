/*
 * @Title: RunMybatis.java
 * @Package com.fan.image
 * @Description: TODO 
 * Copyright 2018 Thuisoft, Inc. All rights reserved.
 * 
 * @author Administrator
 * @date 2018年8月3日
 */
package com.fan.image;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.util.ResourceUtils;

/**
 * ClassName: RunMybatis 
 * @Description: TODO
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年8月3日
 */
public class RunMybatis {
    public static void main(String[] args) {
        try { 
            List<String> warnings = new ArrayList<String>();  
            boolean overwrite = true;   
            File configFile = ResourceUtils.getFile("classpath:generatorConfig.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);  
            Configuration config = null;  
            config = cp.parseConfiguration(configFile);  
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);  
            MyBatisGenerator  myBatisGenerator = new MyBatisGenerator(config, callback, warnings);  
             myBatisGenerator.generate(null); 
             System.out.println("生成完成");

        } catch (Exception e) {  
                e.printStackTrace();  
            }   

    }
}
