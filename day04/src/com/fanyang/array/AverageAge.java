package com.fanyang.array;

import java.util.Scanner;

/**
 * @program: day04
 * @description:计算五个人的平均年纪
 * @author: FanYang
 * @create: 2021-07-22 10:08
 */
public class AverageAge {
    int[] ages = new int[5];
    Scanner scanner = new Scanner(System.in);

    public double averageAge(){
        int sumAge = 0;
        for(int i=0;i<ages.length;){
            System.out.println("请输入第"+(i+1)+"个人的年纪");
            int age = scanner.nextInt();
            if (age>0){
                ages[i] =age;
                sumAge +=age;
                i++;
            }
            else {
                System.out.println("年纪不能为负");
            }
        }
        return sumAge/ages.length;
    }
    public static void main(String[] args) {
        AverageAge averageAge = new AverageAge();
        System.out.println(averageAge.averageAge());
    }
}
