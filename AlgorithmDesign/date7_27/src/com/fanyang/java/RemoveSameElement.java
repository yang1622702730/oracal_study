package com.fanyang.java;/**
 * @author fanYang
 * @create 2021-07-27 20:09
 */

/**
 * @program: AlgorithmDesign
 * @description: 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * @author: FanYang
 * @create: 2021-07-27 20:09
 */
/*public class RemoveSameElement {
    public static int solutions(int[] nums,int val){
        if (nums.length==0||nums==null){
            return 0;
        }
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (val!=nums[i]){
                nums[j]=nums[i];
                j++;
                System.out.println(nums[i]);
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int len = RemoveSameElement.solutions(new int[]{3,2,4,2,3,5},2);
        System.out.println(len);
    }
}*/

//2021-7-28第二次练习
public class RemoveSameElement {
    public static int solutions(int[] nums, int val) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if (val!=nums[j]){
                nums[i] =nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int len = RemoveSameElement.solutions(new int[]{3,2,4,2,3,5},2);
        System.out.println(len);
    }
}