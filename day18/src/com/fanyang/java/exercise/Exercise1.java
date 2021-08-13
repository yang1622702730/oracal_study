package com.fanyang.java.exercise;

import java.util.*;

/**
 * @project_name: OracleStudy
 * @project_description: 猴子选大王问题：10人围一圈从1开始报数，凡是报到3的人被淘汰，然后再从下一个人继续数下去，直到
 * 最后只剩下一个人为止,输出最后一个人的编号
 * @author: FanYang
 * @create_date: 2021-08-11 14:14
 */
public class Exercise1 {
    public static void main(String[] args) {
        boolean isFlag = true;
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ArrayList arrayList = new ArrayList(integers);
        System.out.println(arrayList);
       /* Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            if (next instanceof Integer){
                Integer integer = (Integer)next;
                System.out.println(integer);
                if (integer %3 ==0){

                }
            }*/
        while (arrayList.size() != 1) {
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()){
                Object next = iterator.next();
                System.out.println(next);
                if (next instanceof Integer){
                    Integer integer1 = (Integer)next;
                    if (integer1%3==0){
                        arrayList.remove(integer1);
                    }
                }
            }

        }
    }
}
