package com.company;

import java.util.Scanner;

/**
 * @program: day03
 * @description: 业绩考核
 * @author: FanYang
 * @create: 2021-07-21 09:47
 */
public class PerformanceAppraisal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入员工上个月的业绩为多少个W");
        int sales = scanner.nextInt();
        if (sales>=50){
            System.out.println("标兵");
        }
        else if (sales>=40){
            System.out.println("出色");
        }
        else if (sales>=30){
            System.out.println("达标");
        }
        else if (sales>=0){
            System.out.println("未达标");
        }
        else{
            System.out.println("输入错误，业绩不能为负数");
            System.out.println("请重新编译运行");
        }
    }
}
