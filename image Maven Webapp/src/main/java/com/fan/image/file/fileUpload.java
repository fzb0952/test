/*
 * @Title: fileUpload.java
 * @Package com.fan.image.file
 * @Description: TODO 
 * Copyright 2018 Thuisoft, Inc. All rights reserved.
 * 
 * @author Administrator
 * @date 2018年8月6日
 */
package com.fan.image.file;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName: fileUpload 
 * @Description: TODO
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年8月6日
 */
@Controller
public class fileUpload {

    @RequestMapping("/test")
    @ResponseBody
    public String fileUpload(@RequestParam("test") MultipartFile file){
        if(file.isEmpty()){
            return "flase";
        }
        String fileName =  file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println("size:"+size);
        String path = "D:/test";
        File test = new File(path +"/"+fileName);
        if(!test.getParentFile().exists()){
            test.getParentFile().mkdir();
        }
        try{
            file.transferTo(test);
            return "true";
        }catch(IllegalStateException e){
            e.printStackTrace();
            return "flase";
        }catch(IOException e){
            e.printStackTrace();
            return "flase";
        }
    }
}
