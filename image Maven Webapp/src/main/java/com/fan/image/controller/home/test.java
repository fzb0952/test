/*
 * @Title: test.java
 * 
 * @Package com.fan.image.controller.home
 * 
 * @Description: TODO Copyright 2018 Thuisoft, Inc. All rights reserved.
 * 
 * @author Administrator
 * 
 * @date 2018年8月8日
 */
package com.fan.image.controller.home;

import java.io.IOException;
import java.util.Scanner;

/**
 * ClassName: test 
 * @Description: TODO
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年8月8日
 */
public class test extends Thread {
    /**
     * 
     * Description: TODO
     * @param args   
     * void  
     * @throws IOException 
     * @throws
     * 
     * @author fanzhongbo
     * @date 2018年9月7日
     */

    public static void main(String[] args) throws IOException {
        new test().print(args==null || new test() {{test.main(null);}}.equals(null));
    }

    private void print(boolean flag) {
        if(flag) {
            System.out.println("a");
        }else {
            System.out.println("b");
        }
    }
}
