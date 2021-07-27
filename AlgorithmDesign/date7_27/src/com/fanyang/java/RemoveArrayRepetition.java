package com.fanyang.java;/**
 * @author fanYang
 * @create 2021-07-27 19:40
 */

/**
 * @program: AlgorithmDesign
 * @description: 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * @author: FanYang
 * @create: 2021-07-27 19:40
 */
public class RemoveArrayRepetition {
    public static int solutions(int[] nums) {
        if (nums.length == 0||nums ==null) {
            return 0;
        }
        int i = 1;
//        System.out.println(nums[0]);
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
//                System.out.println(nums[i]);
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int length = RemoveArrayRepetition.solutions(new int[]{0,0,1,1,1,2,2,3,3,4,7});
        System.out.println(length);
    }
}
