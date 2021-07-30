package com.fanyang.java;

/**
 * @project_name: AlgorithmDesign
 * @project_description:给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * @author: FanYang
 * @create_date: ${}-07-30 19:31
 */
public class YangHuiTriangle {


    public int[][] solution1(int row) {
        int[][] arrays = new int[row][];
        arrays[0] = new int[]{1};
        arrays[1] = new int[]{1, 1};
        for (int i = 2; i < row; i++) {
            arrays[i] = new int[i + 1];
            arrays[i][0] = 1;
            arrays[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arrays[i][j] = arrays[i - 1][j - 1] + arrays[i - 1][j];
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        YangHuiTriangle yangHuiTriangle = new YangHuiTriangle();
        int[][] newArrays = yangHuiTriangle.solution1(5);
        for (int i = 0; i < newArrays.length; i++) {
            for (int j = 0; j < newArrays[i].length; j++) {
                System.out.print(newArrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
