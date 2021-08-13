package com.fanyang.java.exercise;

import java.util.ArrayList;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-11 15:12
 */
public class ChooseMonkeyKingMethod2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 11; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        int speakNumber = 0;
        int i = 0;
        while (arrayList.size() != 1) {
            if (i >= arrayList.size()-1) {
                i = 0;
            }
            System.out.println("i = " + i);
            Object o = arrayList.get(i);
            System.out.println("get = " + o);
            if (o instanceof Integer && null != o) {
                Integer integer = (Integer) o;
                speakNumber++;
                if (speakNumber == 2) {
                    arrayList.remove(integer);
                    speakNumber = 0;
                }
                i++;
            }
        }
        System.out.println(arrayList);
    }
}
