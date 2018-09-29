/*
 * @Title: test1.java
 * @Package com.fan.image.controller.home
 * @Description: TODO 
 * Copyright 2018 Thuisoft, Inc. All rights reserved.
 * 
 * @author Administrator
 * @date 2018年8月23日
 */
package com.fan.image.controller.home;

/**
 * ClassName: test1 
 * @Description: TODO
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年8月23日
 */
public class test1 extends Thread{

    @Override
    public void run(){
    	for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"is running.........");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        test1 t = new test1();
        t.start();
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"is runn");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }

}