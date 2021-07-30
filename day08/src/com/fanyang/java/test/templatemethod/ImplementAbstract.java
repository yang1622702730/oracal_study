package com.fanyang.java.test.templatemethod;/**
 * @author fanYang
 * @create 2021-07-28 10:10
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 10:10
 */
public class ImplementAbstract extends TemplateMethod{
    @Override
    public void wakeup() {
        System.out.println("起床...");
    }

    @Override
    public void brushTeeth() {
        System.out.println("刷牙...");
    }

    @Override
    public void washFace() {
        System.out.println("洗脸...");
    }

    @Override
    public void haveBreakfast() {
        System.out.println("吃早饭...");
    }

    @Override
    public void goSchool() {
        System.out.println("去学校...");
    }

}

