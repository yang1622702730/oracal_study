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
/*public class SearchInsert {
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
}*/

//2021-7-28第二次练习
/*public class SearchInsert {
    public static int solutions(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (target==nums[i]){
                return i;
            }
        }
        if (target<nums[0])
            return 0;
        else if (target>nums[len-1])
            return len;
        else{
            for (int i = 0; i < len; i++) {
                if (target>=nums[i]&&target<nums[i+1]){
                    return i+1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int len = SearchInsert.solutions(new int[]{1,2,3}, 4);
        System.out.println(len);
    }
}*/

//二分法解决问题
public class SearchInsert {
    public static int solutions(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int mid = 0;
        while (left<=right){
            mid = (right+left)>>1;
            if (target>nums[mid]){
                left = mid+1;
            }else if (target<nums[mid]){
                right =mid -1;
            }else{
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int len = SearchInsert.solutions(new int[]{1,2,3}, 2);
        System.out.println(len);
    }
}