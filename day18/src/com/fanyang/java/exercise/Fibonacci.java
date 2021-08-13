package com.fanyang.java.exercise;

/**
 * @project_name: OracleStudy
 * @project_description: 用递归实现斐波那契
 * @author: FanYang
 * @create_date: 2021-08-11 14:54
 */
public class Fibonacci {
    public static int solutions(int number) {
        if (number ==0){
            return 0;
        }
        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }
        if (number == 3) {
            return 1;
        }
        if (number == 4) {
            return 2;
        }
        return solutions(number-1)+solutions(number-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.solutions(5));
    }
}
