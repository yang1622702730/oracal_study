package com.fanyang.java.test;

/**
 * @program: testcode
 * @description:
 * @author: FanYang
 * @create: 2021-07-21 09:20
 */
public class Test1 {
    public static void main(String[] args) {
        int a =1;
        if(false||a++>1){
            System.out.println(a);
        }
        System.out.println(a);
    }
}
