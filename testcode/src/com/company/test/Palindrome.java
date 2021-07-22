package com.company.test;

/**
 * @program: testcode
 * @description: 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * @author: FanYang
 * @create: 2021-07-21 13:46
 */
public class Palindrome {

    //方法一
    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        } else {
            if (reverse(x) == x) {
                return true;
            }
        }
        return false;
    }

    public int reverse(int x) {
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


    //方法二
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reverseNumber = 0;
        while(x>reverseNumber){
            if (reverseNumber<(-Math.pow(2,31)/10)||reverseNumber>(Math.pow(2,31)-1)/10){
                return false;
            }
            reverseNumber = reverseNumber*10+x%10;
            x/=10;
        }
        return reverseNumber/10==x||reverseNumber==x;

    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome1(102));
        System.out.println(palindrome.isPalindrome2(101));
    }
}
