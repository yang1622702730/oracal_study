package com.fanyang.java.bigdecimal;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 14:13
 */
public class BigDecimalTest {
    @Test
    public void test1() {
        int i =0;
        BigDecimal bigDecimal = new BigDecimal("-1");
        System.out.println(bigDecimal);
        BigDecimal bigDecimal1 = new BigDecimal(1);
        System.out.println(bigDecimal1);
        BigDecimal bigDecimal2 = new BigDecimal(0.1);//精度有问题
//        BigDecimal bigDecimal2 = new BigDecimal("0.1");//对于double数据类型推荐使用这种方式创建，可以避免精度问题
        System.out.println(bigDecimal2);
        BigDecimal bigDecimal3 = new BigDecimal(0.1f);//精度有问题
        System.out.println(bigDecimal3);
    }

    @Test
    public void test2() {
        BigDecimal bigDecimal = new BigDecimal("-1");
        BigDecimal bigDecimal1 = bigDecimal.abs();//返回绝对值
        System.out.println(bigDecimal1);
        BigDecimal add = bigDecimal.add(new BigDecimal("3"));//加法
        System.out.println(add);
        System.out.println(bigDecimal.divide(add));//除法
        System.out.println(bigDecimal.max(add));//返回较大值，比大小
        System.out.println(add.compareTo(bigDecimal));//比较大小，返回-1,0,1
        System.out.println(bigDecimal.subtract(add));//减法
        System.out.println(BigDecimal.valueOf(1.1111));//这种方式可以为BigDecimal传入double数据类型的参数，不会出现精度问题，而直接通过构造器传入float，double参数会导致精度问题
        System.out.println("**************");
        System.out.println(bigDecimal);
        int i = bigDecimal.intValue();
        System.out.println(i);
    }
}
