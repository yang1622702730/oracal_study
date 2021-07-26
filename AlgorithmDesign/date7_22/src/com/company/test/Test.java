package com.company.test;

/**
 * @program: testcode
 * @description: 测试各数据类型的默认值
 * @author: FanYang
 * @create: 2021-07-20 13:51
 */
public class Test {
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;

    public static void main(String[] args) {
        System.out.println("Bool :" + bool);
        System.out.println("Byte :" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double :" + d);
        System.out.println("Float :" + f);
        System.out.println("Integer :" + i);
        System.out.println("Long :" + l);
        System.out.println("Short :" + sh);
        System.out.println("String :" + str);
    }
    /*
     * @Description:
     * @Param: [name, i]
     * @return: void
     * @author: FanYang
     * @time: 2021/7/20 15:01
    */

    public void prints(String name,int i){
        System.out.println(name);
    }

}