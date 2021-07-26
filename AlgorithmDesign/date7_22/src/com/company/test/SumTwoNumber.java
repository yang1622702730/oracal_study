package com.company.test;

/**
 * @program: testcode
 * @description: 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。
 * @author: FanYang
 * @create: 2021-07-21 10:34
 */
public class SumTwoNumber {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int result = nums[i] + nums[j];
                if (result == target) {
                    System.out.println("i="+i+",j="+j);
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SumTwoNumber sumTwoNumber = new SumTwoNumber();
        int[] ints = new int[]{2,7,11,15};
        int target =17;
        sumTwoNumber.twoSum(ints,target);
    }
}
