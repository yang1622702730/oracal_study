package com.company.test;

/**
 * @program: testcode
 * @description: 数组角标越界的几种情况
 * @author: FanYang
 * @create: 2021-07-20 08:52
 */
public class ArrayIndexOutOfBoundsExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
//        System.out.println(arr[0]);//第一种
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
