package com.fanyang.java.test;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-07 10:45
 */
public class Test2 {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A{
    int flag = 1;
    public A(){
        test();
        System.out.println("hhh");
//        System.out.println("A的构造器");
    }
    public void test(){
        System.out.println("super "+ flag);
    }
//    static {
//        System.out.println("A的静态代码块");
//    }
//    {
//        System.out.println("A的非静态代码块");
//    }
}
class B extends A{
    int flag = 5;
    public B(){
        super();
        System.out.println(flag);
    }
    public void test(){
        System.out.println("super1 "+ flag);
    }
//    static {
//        System.out.println("B的静态代码块");
//    }
//    {
//        System.out.println("B的非静态代码块");
//    }
}