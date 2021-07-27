package com.fanyang.java.test;

import java.math.BigDecimal;

/**
 * @program: testcode
 * @description: 空指针异常
 * @author: FanYang
 * @create: 2021-07-20 08:53
 */
public class NullPointerExceptionTest {
    public static void main(String[] args) {
        //情况一
//        int[] arr1 = new int[]{1,2,3};
//        arr1 = null;
//        System.out.println(arr1[0]);
        //情况二
//        int[][] arr2 = new int[4][];
//        System.out.println(arr2[0][0]);
        //情况三
        String[] arr3 = new String[]{"AA","BB","CC"};
        arr3[0] = null;
        System.out.println(arr3[0].toString());
    }
    /*
      */
}
