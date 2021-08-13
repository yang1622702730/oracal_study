package com.fanyang.java.test.abstraction;/**
 * @author fanYang
 * @create 2021-07-28 9:34
 */

/**
 * @program: OracleStudy
 * @description: 抽象类的实现子类
 * @author: FanYang
 * @create: 2021-07-28 09:34
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗在吃饭...");
    }

    @Override
    public void sleep() {
        System.out.println("狗在睡觉...");
    }
}
