package com.company;

import java.util.Scanner;

/**
 * @program: day03
 * @description: 根据销售额发放奖励
 * @author: FanYang
 * @create: 2021-07-21 09:29
 */
public class Sales {
    public static void main(String[] args) {
        int sales = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入销售额");
        sales = scanner.nextInt();
        if (sales<=10000){
            System.out.println("奖励1000元");
        }
        else if (sales<=15000){
            System.out.println("奖励1500元");
        }
        else{
            System.out.println("奖励3000元");
        }
        /*if (sales>=15000){
            System.out.println("奖励1500元");
        }
        else if (sales>=10000){
            System.out.println("奖励1000元");
        }
        else{
            System.out.println("业绩没达标");
        }*/
    }
}
