package com.fanyang.java;

/**
 * @program: AlgorithmDesign
 * @description:给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @author: FanYang
 * @create: 2021-07-29 09:19
 */
public class PlusOne {
    public static int[] solutions(int[] digits) {
        /*int len = digits.length;
        if (1 == digits.length) {
            if(digits[len-1]!=9){
                digits[0] += 1;
                return digits;
            }
            else{
                int[] newInt = new int[2];
                newInt[0] = 1;
                newInt[1] = 0;
                return newInt;
            }
        } else if (1 < len && len <= 100) {
            if (digits[len-1]>=0&&digits[len-1] < 9) {
                digits[len-1] += 1;
                return digits;
            }
            else if(digits[len-1]==9){
                digits[len-1] = 0;
                digits[len-2] +=1;
                len--;
                return solutions(digits);
            }
        }
        return null;*/
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
//                for (int j = 0; j < digits.length; j++) {
//                    System.out.println(digits[j]);
//                }
                return digits;
            }

        }
        //如果所有位都是进位，则长度+1
        digits = new int[digits.length + 1];
        digits[0] = 1;
        for (int j = 0; j < digits.length; j++) {
            System.out.println(digits[j]);
        }
        return digits;
    }


    //2021-7-30第二次练习
    public static int[] solutions2(int[] digits) {
        if (0 == digits.length || null == digits) {
            return null;
        }
        for (int i = digits.length - 1; i >= 1; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                System.out.println("aaaaaa");
                return digits;
            }
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0]+=1;
        System.out.println("sasfaf");
        return newDigits;
    }

    public static void main(String[] args) {
        PlusOne.solutions(new int[]{8, 8, 9});
        int[] ints = PlusOne.solutions2(new int[]{9, 8, 9});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);

        }
    }
}
