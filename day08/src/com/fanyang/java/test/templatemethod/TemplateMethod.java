package com.fanyang.java.test.templatemethod;/**
 * @author fanYang
 * @create 2021-07-28 10:04
 */

/**
 * @program: OracleStudy
 * @description: 设计模式：模板方法
 * @author: FanYang
 * @create: 2021-07-28 10:04
 */
public abstract class TemplateMethod {
    public void getUpOrder(){
        System.out.println("早上的任务安排");
        wakeup();
        brushTeeth();
        washFace();
        haveBreakfast();
        goSchool();
    }
    public abstract void wakeup();
    public abstract void brushTeeth();
    public abstract void washFace();
    public abstract void haveBreakfast();
    public abstract void goSchool();
}
