package com.fanyang.array;

/**
 * @program: day04
 * @description:
 * @author: FanYang
 * @create: 2021-07-22 09:46
 */
public class TestArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "王铭";
        names[1] = "王赫";
        names[2] = "张学良";
        names[3] = "孙居龙";
        names[4] = "王宏志";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
