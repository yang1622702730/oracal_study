package com.fanyang.java.abstraction;/**
 * @author fanYang
 * @create 2021-07-28 9:36
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 09:36
 */
public class Test1 {
    public static void main(String[] args) {
/*        Animal animal = new Animal();//抽象类无法直接实例化，编译不通过
        animal.eat();*/
        Animal dog = new Dog();
        dog.sleep();
        dog.eat();
//        dog.run();
    }
}
