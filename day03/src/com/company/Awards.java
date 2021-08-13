package com.company;

import java.util.Scanner;

/**
 * @program: day03
 * @description: 根据部门评奖
 * @author: FanYang
 * @create: 2021-07-21 10:20
 */
public class Awards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年终业绩额");
        int sales = scanner.nextInt();
        if (sales >=50){
            System.out.println("有资格进入年终评奖");
            System.out.println("请输入部门在次进行划分");
            String department = scanner.next();
            if (department.equals("售前部")){
                System.out.println("奖励10000");
            }
            else if (department.equals("售后部")){
                System.out.println("奖励9000");
            }
            else{
                System.out.println("没有这个部门");
            }
        }
        else{
            System.out.println("业绩未达标，没有资格评奖");
        }
    }
}
