package com.fanyang.java.abstraction;/**
 * @author fanYang
 * @create 2021-07-28 9:32
 */

/**
 * @program: OracleStudy
 * @description: 抽象动物类，抽象类无法直接实例化，必须通过子类重写抽象方法，在实例化子类去调用方法
 * @author: FanYang
 * @create: 2021-07-28 09:32
 */
public abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
/*    void run(){//jdk几之后抽象类中可以写非抽象的方法
        System.out.println("奔跑");
    }*/
}
