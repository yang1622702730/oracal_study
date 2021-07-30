package com.fanyang.java.test.animal;/**
 * @author fanYang
 * @create 2021-07-26 14:12
 */

/**
 * @program: OracleStudy
 * @description: 继承动物的小狗子类
 * @author: FanYang
 * @create: 2021-07-26 14:12
 */
public class Dog extends Animal {
    private double appetite;

    public Dog(String name, int age, char gender, double weight, String color, double appetite) {
        super(name, age, gender, weight, color);
        this.appetite = appetite;
    }

    public Dog(double appetite) {
        super();
        this.appetite = appetite;
    }

    public Dog() {
    }

    public double getAppetite() {
        return appetite;
    }

    public void setAppetite(double appetite) {
        this.appetite = appetite;
    }

    /*
     * @Description: 看门狗
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/26 14:14
     */
    public void watchdog() {
        System.out.println("狗狗会看家");
    }

    @Override
    public void info() {
        System.out.println("Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", weight=" + getWeight() +
                ", color=" + getColor() + '\'' +
                ", appetite="+getAppetite()+'}');
    }
}
