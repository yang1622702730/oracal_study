package com.fanyang.java.test;

import java.util.Scanner;

/**
 * @program: testcode
 * @description:测试break和continue的作用
 * @author: FanYang
 * @create: 2021-07-21 16:47
 */
public class BreakAndContinue {
    Scanner scanner = new Scanner(System.in);
    int n;
    public void testBreakAndContinue(){
        while(true){
            System.out.println("Enter a number between 1 and 10");
            n = scanner.nextInt();
            if (n<1||n>10){
                continue;//跳出当次循环
            }
            System.out.println("number = "+n);
            break;//结束循环
        }
    }

    public static void main(String[] args) {
        BreakAndContinue breakAndContinue = new BreakAndContinue();
        breakAndContinue.testBreakAndContinue();
    }
}
