package com.fanyang.java.test;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-07 11:01
 */
public class Test4 {
    public static void main(String[] args) {
        try {
            float i = 100 /0;
            System.out.println("0");
        } catch (Exception e) {
            System.out.print(1);
           throw new RuntimeException("出错了");
        }
        finally {
            System.out.print(2);
        }
        System.out.print(3);
    }
}
