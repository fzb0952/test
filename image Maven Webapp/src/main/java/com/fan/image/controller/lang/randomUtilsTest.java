package com.fan.image.controller.lang;
import org.apache.commons.lang3.RandomStringUtils;
/**
 * 
 * ClassName: randomUtils 
 * @Description: RandomUtils使用
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年9月26日
 */
public class randomUtilsTest {

    public static void main(String[] args) {
        System.out.println(RandomStringUtils.random(100));
        System.out.println(RandomStringUtils.random(5, new char[]{'a','b','c','d','e','f', '1', '2', '3'}));
        System.out.println(RandomStringUtils.randomAlphanumeric(5));
        System.out.println(RandomStringUtils.randomNumeric(5));
        System.out.println(RandomStringUtils.randomAlphabetic(5));
    }
}
