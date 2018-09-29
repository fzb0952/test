/*
 * @Title: ImageConfig.java
 * @Package com.fan.image.file
 * @Description: TODO 
 * Copyright 2018 Thuisoft, Inc. All rights reserved.
 * 
 * @author Administrator
 * @date 2018年8月6日
 */
package com.fan.image.file;

import javax.servlet.MultipartConfigElement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: ImageConfig 
 * @Description: TODO
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年8月6日
 */
@Configuration
public class ImageConfig {
    
    @Value("${image.location}")
    private String location;
    
    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("2MB");
        factory.setMaxRequestSize("10MB");
        return factory.createMultipartConfig();
    }
}
