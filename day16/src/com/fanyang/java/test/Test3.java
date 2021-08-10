package com.fanyang.java.test;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-07 10:55
 */
public class Test3 {
    public static void main(String[] args) {
        String str = new String();//char[] value = new char[0];
        String str1 = new String("abc");//char[] value = new char[]{'a','b','c'};

        StringBuffer sb1 = new StringBuffer();//char[] value = new char[16];底层创建了一个长度是16的数组。
        System.out.println(sb1.length());//0，虽然长度数组长度为16但是，其内部进行过特殊的处理，返回的是存储的值的个数
        sb1.append('a');//value[0] = 'a';
        sb1.append('b');//value[1] = 'b';

        StringBuffer sb2 = new StringBuffer("abc");//char[] value = new char["abc".length() + 16];
    }
}
