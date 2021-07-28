package com.fanyang.java.test;

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 17:16
 */
public class Test2 implements Interface1,Interface2{

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.method();
    }

    @Override
    public void method() {
        System.out.println("实现类中重写的方法，不重写的话，编译无法通过");
    }
}
interface Interface1{
    public default void method(){
        System.out.println("接口1的默认方法优先");
    }
}
interface Interface2{
    public default void method(){
        System.out.println("接口2的默认方法优先");
    }

}
