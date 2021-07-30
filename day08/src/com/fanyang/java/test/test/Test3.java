package com.fanyang.java.test.test;

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 17:22
 */
public class Test3 extends Class1 implements Interface3{
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.useMethod();
    }

    @Override
    public void method() {
        System.out.println("子类中重写的方法");
    }
    public void useMethod(){
        super.method();
        Interface3.method1();
        Interface3.super.method();
        method();
    }
}
class Class1{
    void method(){
        System.out.println("类中的方法");
    }
}
interface Interface3{
    static void method1(){
        System.out.println("接口中的静态方法");
    }
    default void method(){
        System.out.println("接口中的默认方法");
    }
}
