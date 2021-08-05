package com.fanyang.java;

/**
 * @project_name: AlgorithmDesign
 * @project_description:假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @author: FanYang
 * @create_date: ${}-07-30 20:15
 */
public class ClimbStairs {
    static int sum =0;
    public static int solutions(int order) {
        if (order == 1) {
            order--;
//            sum +=1;
            return 1;
        }
        if (order<0){
            return 0;
        }
        if (order == 2) {
            order--;
//            sum +=2;
            return 2;
        } else {
            return (solutions(order - 1) + solutions(order - 2));
        }
    }
    public int climbStairs(int n){
        if (n == 1) {
            n--;
//            sum +=1;
            return 1;
        }
        if (n<0){
            return 0;
        }
        if (n == 2) {
            n--;
//            sum +=2;
            return 2;
        } else {
            return (climbStairs(n - 1) + climbStairs(n - 2));
        }
    }

    public static void main(String[] args) {
        int solutions = ClimbStairs.solutions(5);
        System.out.println(solutions);
    }
}
