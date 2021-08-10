package com.fanyang.java.test;



/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-30 09:10
 */
public class StringTest1 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = new String("abc");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);
        StringTest1 stringTest1 = new StringTest1();

    }
}
interface B{}
interface A extends B{

}
