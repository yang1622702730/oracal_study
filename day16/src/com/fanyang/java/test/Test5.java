package com.fanyang.java.test;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-07 11:41
 */
public class Test5 {
    public void method(int i){
        System.out.println("int "+i);
    }
    public void method(float i){
        System.out.println("float "+i);
    }
    public void method(byte i){
        System.out.println("byte "+i);
    }
    public void method(short i){
        System.out.println("byte "+i);
    }
    public void method(long i){
        System.out.println("byte "+i);
    }

    public static void main(String[] args) {
        Test5 test5 = new Test5();
        test5.method(8);
        for (int i = 0; i < 5; i++) {
            if (i%2==0){
                break;
            }
            System.out.println(i);
        }
    }
}
