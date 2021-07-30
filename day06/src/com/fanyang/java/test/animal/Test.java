package com.fanyang.java.test.animal;/**
 * @author fanYang
 * @create 2021-07-26 14:21
 */

/**
 * @program: OracleStudy
 * @description: 测试猫和狗的属性和方法
 * @author: FanYang
 * @create: 2021-07-26 14:21
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("菲菲",7,'女',20.0,"白色",300);
        Cat cat = new Cat("油条",1,'男',10.0,"黄色",200);
        System.out.println("下面将先调用狗的方法");
        dog.watchdog();
        dog.eat();
        dog.play();
        dog.run();
        dog.info();
        System.out.println("下面将先调用猫的方法");
        cat.coquetry();
        cat.eat();
        cat.play();
        cat.run();
        cat.info();
    }
}
