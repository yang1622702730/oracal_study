package com.company;

/**
 * @program: testcode
 * @description: 测试变量的类型
 * @author: FanYang
 * @create: 2021-07-20 11:07
 */

//不能再主体类的外部定义属性
//char sGender = '男';
public class Student {
    /*
     *以下三个属性属于全局变量
     */
    int sNo;
    String sName;
    int sAge;

    public Student(int sNo, String sName, int sAge) {  //形参局部变量，只能在2这个地方对其访问
        this.sNo = sNo;
        this.sName = sName;
        this.sAge = sAge;
        char sSex = '男';//方法局部变量，只作用于方法体内，外部无法对其访问
    }


}
