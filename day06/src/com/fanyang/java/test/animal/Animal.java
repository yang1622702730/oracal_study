package com.fanyang.java.test.animal;/**
 * @author fanYang
 * @create 2021-07-26 14:06
 */

/**
 * @program: OracleStudy
 * @description: 所有动物的父类
 * @author: FanYang
 * @create: 2021-07-26 14:06
 */
public class Animal {
    private String name;
    private int age;
    private char gender;
    private double weight;
    private String color;

    public Animal() {

    }

    public Animal(String name, int age, char gender, double weight, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*
     * @Description: 吃饭
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/26 14:12
     */
    public void eat() {
        System.out.println("真在吃饭...");
    }

    /*
     * @Description: 奔跑
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/26 14:11
     */
    public void run() {
        System.out.println("真在奔跑...");
    }

    /*
     * @Description: 睡觉
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/26 14:11
     */
    public void sleep() {
        System.out.println("真在睡觉...");
    }

    /*
     * @Description: 玩耍
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/26 14:11
     */
    public void play() {
        System.out.println("真在玩耍");
    }

    /*
     * @Description: 打印动物的基本信息
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/26 14:11
     */
    public void info() {
        System.out.println("Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}');
    }

}
