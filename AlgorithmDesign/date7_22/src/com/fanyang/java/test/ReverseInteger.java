package com.fanyang.java.test;

/**
 * @program: testcode
 * @description:给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * @author: FanYang
 * @create: 2021-07-21 11:16
 */
public class ReverseInteger {
    public int reverse1(int x) {
        int y = 0;
        while (x != 0) {
            if (y < (-Math.pow(2, 31) / 10) || y > (Math.pow(2, 31) - 1) / 10) {
                return 0;
            }
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return y;
    }

    public int reverse2(int x) {
        int n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
        }
        return n <= Integer.MAX_VALUE || n >= Integer.MIN_VALUE ? n : 0;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse1(1534236469));
        System.out.println(reverseInteger.reverse2(1534236469));
    }
}
