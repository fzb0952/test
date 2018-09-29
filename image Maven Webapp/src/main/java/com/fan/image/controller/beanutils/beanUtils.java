package com.fan.image.controller.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.jupiter.api.Test;

import com.fan.image.bean.User;

/**
 * 
 * ClassName: beanUtils 
 * @Description: BeanUtils的使用
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年9月27日
 */
public class beanUtils {

    /**
     * 
     * Description: 新建一个user
     * @return   
     * User  
     * @throws
     * 
     * @author fanzhongbo
     * @date 2018年9月27日
     */
    public static User initUser(){
        User user = new User();
        user.setUserName("zhangsan");
        user.setAge(18);
        user.setSex("man");
        return user;
    }
    /**
     * 
     * Description: 打印user
     * @param user   
     * void  
     * @throws
     * 
     * @author fanzhongbo
     * @date 2018年9月27日
     */
    public static void printUser(User user) {
        System.out.println(user.getUserName()+" "+user.getSex()+" "+user.getAge());
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        //cloneBean
        User user = (User)BeanUtils.cloneBean(initUser());
        System.out.print("克隆user：");
        printUser(user);
        //copyProperties
        User user1 = new User();
        BeanUtils.copyProperties(user1, user);
        System.out.print("复制user：");
        printUser(user1);
        //describe
        Map<?, ?> map = BeanUtils.describe(user);
        System.out.println(map.get("userName")+" "+map.get("sex")+" "+map.get("age"));
        //getArrayProperty
        String[] user2 = BeanUtils.getArrayProperty(user, "userName");
        System.out.println(Arrays.toString(user2));
        //populate
        User user3 = new User();
        Map<String, Comparable> map1 = new HashMap<String, Comparable>();
        map1.put("userName", "lisi");
        map1.put("sex", "man");
        map1.put("age", 18);
        BeanUtils.populate(user3, map1);
        System.out.print("将map转换为bean：");
        printUser(user3);
        
    }
}
