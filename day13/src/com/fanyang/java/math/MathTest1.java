package com.fanyang.java.math;

import org.junit.Test;

/**
 * @project_name: OracleStudy
 * @project_description:Math类的方法测试
 * @author: FanYang
 * @create_date: 2021-08-03 09:18
 */
public class MathTest1 {
    @Test
    public void test1() {
        double a = 30.0 / 180.0 * Math.PI;
        double b = Math.toRadians(30);//Math提供方法求弧度制
        System.out.println(a);
        System.out.println(Math.sin(a));//计算30°对应的正弦值sin
        System.out.println(Math.cos(a));//计算30°对应的正弦值cos
        System.out.println(Math.sqrt(4));//开方
        System.out.println(Math.ceil(9.9));//向上取整
        System.out.println(Math.floor(9.9));//向下取整
        System.out.println(Math.rint(4.99999));//四舍五入
        System.out.println(Math.rint(4.499999));//四舍五入
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.round(4444444445543535454l));//如果输入参数超过Integer的最大最小值，则返回Integer的最大或最小值
        System.out.println((int) Math.floor(Math.random() * 101));//方式一：生成一百以内的随机正整数
        System.out.println((int) Math.ceil(Math.random() * 99));//方式二：生成一百以内的随机正整数
        System.out.println((int) (Math.random() * 99 + 1));//方式三：生成一百以内的随机正整数
        System.out.println(Math.abs(-1.45));
        System.out.println();
    }
}
