package com.fan.image.controller.lang;


import org.apache.commons.lang3.ArrayUtils;

/**
 * 
 * ClassName: arrayUtilsTest 
 * @Description: arrayUtils工具类使用
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年9月5日
 */
public class arrayUtilsTest {

    /**
     * 
     * Description: 打印数组
     * @param str   
     * void  
     * @throws
     * 
     * @author fanzhongbo
     * @date 2018年9月26日
     */
    public static void printArray(String[] str) {
        System.out.println(ArrayUtils.toString(str));
    }
    public static void main(String[] args) {
        String[] s=new String[2];
        System.out.println(s.length);
        System.out.println(ArrayUtils.isEmpty(s));
        String[] str= {"1","2","3","4"};
        printArray(ArrayUtils.add(str,"5"));
        String[] str1 = ArrayUtils.clone(str);
        printArray(str1);
        System.out.println(ArrayUtils.contains(str, "3"));
        System.out.println(ArrayUtils.getLength(str));
        String[] str2 = null;
        System.out.println(ArrayUtils.isEmpty(str2));
        System.out.println(ArrayUtils.isSameLength(str, str1));
        printArray(ArrayUtils.subarray(str, 1,3));
    }
}

