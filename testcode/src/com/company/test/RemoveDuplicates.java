package com.company.test;

/**
 * @program: testcode
 * @description:删除数组中重复的值
 * @author: FanYang
 * @create: 2021-07-22 19:23
 */
public class RemoveDuplicates {
    public static int solutions(int[] nums){
        int[] newNums = new int[nums.length];
        int count = 0;
        int start = 0;
        for (int i =start;i<nums.length;i++){
            for (int j=start+1;j<nums.length;j++){
                if (nums[i]!=nums[j]){
                    start = j;
                    count++;
                    newNums[count] = nums[i];
                }
            }
        }
        for (int i=0;i<newNums.length;i++){
            if (newNums !=nu)
        }
        return newNums.length;
    }

    public static void main(String[] args) {
        int length = RemoveDuplicates.solutions(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(length);
    }
}
