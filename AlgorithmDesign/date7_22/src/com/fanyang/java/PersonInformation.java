package com.fanyang.java;

/**
 * @program: testcode
 * @description: 打印个人信息
 * @author: FanYang
 * @create: 2021-07-20 11:15
 */
public class PersonInformation {
    String name = "杨凡";  //全局变量
    int age = 22;
    double height = 1.78;
    double weight = 139.5;
    String school = "cqust";

    public PersonInformation(String name, int age, double height, double weight, String school,String love) {
        //这些（）内的变量都属于局部变量，是形参范畴内的
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.school = school;
        double socre = 99.9;//这个参数属于局部变量，它属于在方法体内定义的范畴
        System.out.println(love);
    }

    @Override
    public String toString() {
        return "PersonInformation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", school='" + school + '\'' +
                '}';
    }

    public static void main(String[] args) {
        PersonInformation personInformation = new PersonInformation("杨凡",22,178,139.5,"cqust","running");
        System.out.println(personInformation.toString());
    }
}