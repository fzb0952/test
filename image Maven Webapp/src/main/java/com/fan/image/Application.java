package com.fan.image;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2018/3/11.
 */
@SpringBootApplication
@MapperScan("com.fan.image.dao")
@ComponentScan({"com.fan.image.controller","com.fan.image.service"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
