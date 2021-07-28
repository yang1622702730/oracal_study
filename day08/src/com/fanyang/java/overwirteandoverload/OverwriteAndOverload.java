package com.fanyang.java.overwirteandoverload;/**
 * @author fanYang
 * @create 2021-07-28 11:12
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 11:12
 */
public class OverwriteAndOverload extends TestOverwrite {
    @Override
    public String f1() {
        System.out.println("First Overwrite f1()...");
        return null;
    }

    @Override
    public void f2() {
        System.out.println("First Overwrite f2()...");
    }


    public void f2(int i) {
        System.out.println("First Overload f2()...");
    }
    private void f2(int i,int j){
        System.out.println("Second Overwrite f2()...");
    }
    public int f2(int i,int j,int s){
        System.out.println("Third Overwrite f2()...");
        return 0;
    }

}

class Test {
    public static void main(String[] args) {
        TestOverwrite overwriteAndOverload = new OverwriteAndOverload();
        overwriteAndOverload.f1();
        overwriteAndOverload.f2();
    }
}
