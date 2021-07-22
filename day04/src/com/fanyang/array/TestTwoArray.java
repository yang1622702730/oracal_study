package com.fanyang.array;

/**
 * @program: day04
 * @description:
 * @author: FanYang
 * @create: 2021-07-22 11:05
 */
public class TestTwoArray {
    public static void main(String[] args) {
       /* int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);//null

        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);//null
        System.out.println(arr3[0]);//null
        System.out.println(arr3[1]);//地址值*/
/*        String[] arr3 = new String[]{"AA","BB","CC"};
        arr3[0] = null;
        System.out.println(arr3[0].toString());*/
/*        int[][] arr2 = new int[4][];
        System.out.println(arr2[0][0]);*/
        String[][] arr2 = new String[3][2];
        arr2[0][1] = new String("A");
        arr2[0][0] = new String("Badad");
        int[][] iii = new int[3][2];
        for (int i = 0; i < iii.length; i++) {
            for (int j = 0; j < iii[i].length; j++) {
                iii[i][j] = 1;
                System.out.println(iii[i][j]);
            }
        }

        int[][] iiii = new int[3][2];
        for (int i = 0; i < iiii.length; i++) {
            iii[i] = new int[2];
            System.out.println(iii[i]);
        }
    }
//        System.out.println(arr2[0][0]);
}
