package com.fanyang.java;

public class Main {
    int i;
    int j;

    public void show(int m, String... strs) {
        System.out.println("show(String ... strs)");

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
    public void show(int m, int... ints) {
        System.out.println("show(String ... strs)");
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static void main(String[] args) {
        Main mains = new Main();
        System.out.println(mains.i);
        System.out.println(mains.j);
        mains.show(1, "1", "2", "3");
        mains.show(1,2,3,4,5);
    }

}
