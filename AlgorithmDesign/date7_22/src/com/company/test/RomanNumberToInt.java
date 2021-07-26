package com.company.test;

import org.junit.Test;

/**
 * @program: testcode
 * @description:罗马数字转整数
 * @author: FanYang
 * @create: 2021-07-21 14:56
 */
public class RomanNumberToInt {
    public int romanToInt(String s) {
        int rightNumber = 0;
        int firstNumber = getValues(s.charAt(0));
        int otherNumber = 0;
        for (int i = 1; i < s.length(); i++) {
            otherNumber = getValues(s.charAt(i));
            if (firstNumber < otherNumber) {
                rightNumber -= firstNumber;
            } else if (firstNumber >= otherNumber) {
                rightNumber += firstNumber;
            }
            firstNumber = otherNumber;
        }
        rightNumber += firstNumber;
        return rightNumber;
    }


    public static int getValues(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    @Test
    public void tests() {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
