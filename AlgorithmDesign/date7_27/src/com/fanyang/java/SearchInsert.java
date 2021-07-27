package com.fanyang.java;/**
 * @author fanYang
 * @create 2021-07-27 20:30
 */

/**
 * @program: AlgorithmDesign
 * @description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * @author: FanYang
 * @create: 2021-07-27 20:30
 */
public class SearchInsert {
    public static int solutions(int[] nums, int target) {
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                flag = false;
                return i;
            }
        }
        if (flag) {
            int n = nums.length;
            if (target < nums[0]) {
                return 0;
            } else if (n == 1) {
                if (target >= nums[0]) {
                    return 1;
                } else {
                    return 0;
                }
            } else if (target >= nums[n - 1]) {
                return n;
            } else {
                for (int i = 0; i < n - 1; i++) {
                    if (target >= nums[i] && target <= nums[i + 1]) {
                        return i + 1;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int len = SearchInsert.solutions(new int[]{1}, 2);
        System.out.println(len);
    }
}
