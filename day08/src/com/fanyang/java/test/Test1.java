package com.fanyang.java.test;

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 17:08
 */
public class Test1 extends Classs implements Interfacess{


    public static void main(String[] args) {
        Test1 test = new Test1();
        test.method();
    }
}
class Classs{
    public void method(){
        System.out.println("类的方法优先");
    }
}
interface Interfacess{
    public default void method(){
        System.out.println("接口的默认方法优先");
    }
}
