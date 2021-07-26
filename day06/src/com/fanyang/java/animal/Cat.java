package com.fanyang.java.animal;/**
 * @author fanYang
 * @create 2021-07-26 14:14
 */

/**
 * @program: OracleStudy
 * @description: 继承于动物的猫咪子类
 * @author: FanYang
 * @create: 2021-07-26 14:14
 */
public class Cat extends Animal {
    private double tailLength;

    public Cat() {
    }

    public Cat(double tailLength) {
        this.tailLength = tailLength;
    }

    public Cat(String name, int age, char gender, double weight, String color, double tailLength) {
        super(name, age, gender, weight, color);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    /*
     * @Description: 猫咪撒娇，粘人
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/26 14:16
     */
    public void coquetry() {
        System.out.println("猫咪会在主人身上撒娇");
    }

    @Override
    public void info() {
        System.out.println("Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", weight=" + getWeight() +
                ", color=" + getColor() + '\'' +
                ", tailLength=" + getTailLength() + '}');
    }
}
