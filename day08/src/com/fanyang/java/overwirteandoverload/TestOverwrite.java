package com.fanyang.java.overwirteandoverload;/**
 * @author fanYang
 * @create 2021-07-28 11:12
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 11:12
 */
public class TestOverwrite {
    public Object f1(){
        System.out.println("f1()...");
        return null;
    }
    void f2(){
        System.out.println("f2()...");
    }
    private void f3(){
        System.out.println("f3()...");
    }
}
