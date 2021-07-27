package com.fanyang.java.test;

/**
 * @program: testcode
 * @description:有效的括号
 * @author: FanYang
 * @create: 2021-07-22 19:06
 */
public class ValidBrackets {
    public static boolean solutions(){
        String str = "[]";
        str.contains("[]");
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        return false;
    }

    public static void main(String[] args) {
        ValidBrackets.solutions();
    }
}
