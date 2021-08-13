package com.fanyang.array;

import java.util.Scanner;

/**
 * @program: day04
 * @description: 杨辉三角的具体实现
 * @author: FanYang
 * @create: 2021-07-22 13:24
 */
public class YangHuiTriangle {
    public void SpecificOperations() {
        System.out.println("下面将根据你的输入的行数打印杨辉三角");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        int[][] twoArray = new int[rows][];
        twoArray[0] = new int[]{1};
        twoArray[1] = new int[]{1, 1};
//        System.out.println(twoArray[0]);
        for (int i = 2; i < twoArray.length; i++) {
//            System.out.println("i = "+i);
            twoArray[i] = new int[i + 1];
            for (int j = 0; j < twoArray[i].length; j++) {
//                System.out.println("j = "+j );
                if (j == 0) {
//                    System.out.println("j=0");
                    twoArray[i][0] = 1;
                    continue;
                }
                if (j == twoArray[i].length - 1) {
//                    System.out.println("j == twoArray[i].length - 1");
                    twoArray[i][j] = 1;
                    continue;
                }
                twoArray[i][j] = twoArray[i - 1][j - 1] + twoArray[i - 1][j];
            }
        }

        //直角杨辉三角
/*        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
//                System.out.println("twoArray["+i+"]"+"["+ j+"] =" +twoArray[i][j]);
                System.out.print(twoArray[i][j]+" ");
            }
            System.out.println();
        }*/
        //等腰杨辉三角
        int emptyCase = 0;
        for (int i = 0; i < twoArray.length; i++) {
            emptyCase = twoArray.length -i-1;
            for (int k = 0;k<emptyCase;k++){
                System.out.print(" ");
            }
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        YangHuiTriangle yangHuiTriangle = new YangHuiTriangle();
        yangHuiTriangle.SpecificOperations();
    }
}
