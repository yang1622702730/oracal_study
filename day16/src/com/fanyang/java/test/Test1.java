package com.fanyang.java.test;

import org.junit.Test;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-07 08:28
 */
public class Test1 {
    char c;
    double b;
    long l1 = 1L;
    float f1 = 1.1f;
    float f;
    long l;
    boolean d;
    char c1 = '0';
    char c3 = 65;
    char c2 = '\0';
    final int I = 0;
    @Test
    public void test1(){
        System.out.println(c);
        System.out.println(b);
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);
        System.out.println(c2);
        System.out.println(c==c2);
        System.out.println(c1);
        System.out.println(c3);
    }
    @Test
    public void test2(){
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];
        System.out.println(arr1[0][1]);//2
        System.out.println(arr1[1].length);
        System.out.println(arr2[1][1]);//null

        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);//null
        System.out.println(arr3[0]);//null
        //System.out.println(arr3[0][1]);//报错空指针
        System.out.println(arr3[1]);//地址值
    }
}
