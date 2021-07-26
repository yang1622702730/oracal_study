package com.company.test;

/**
 * @program: testcode
 * @description: 快速排序的实现
 * @author: FanYang
 * @create: 2021-07-23 09:08
 */
public class QuickSort {

    public static void positiveSort() {
    }

    public static void reverserSort() {
    }

    public static void main(String[] args) {
//        int[] numbers = new int[3];
//        String[][] strs = new String[3][1];
//        System.out.println(numbers[0]);
//        System.out.println(strs[0][0]);
//    }
        int[][] i = {{1, 2, 3}, {2, 3}};
        System.out.println(i[0][2]);
        int [][] i1 = {{1,2},{4,5}};
        for (int j = 0;j<i1.length;j++){
            System.out.println(i1[j]);
            for (int k = 0;k<i1[j].length;k++){
                System.out.println(i1[j][k]);
            }
        }
    }
}
