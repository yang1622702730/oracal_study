package com.fanyang.java.collection.exercise;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @project_name: OracleStudy
 * @project_description: 练习七：创建ArrayList实例化对象，添加10个以上的元素，
 * 在2号位插入一个元素，获得5号位元素，删除6号位元素，修改7号位的元素；
 * @author: FanYang
 * @create_date: 2021-08-10 19:37
 */
public class Exercise7 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add("AA");
        arrayList.add(5656);
        arrayList.add(8989);
        arrayList.add("BB");
        arrayList.add(414141);
        arrayList.add(25353);
        arrayList.add("CC");
        arrayList.add("DD");
        System.out.println(arrayList);
        arrayList.add(2, "DADDADD");
        System.out.println(arrayList);
        Object o = arrayList.get(5);
        System.out.println(o);
        arrayList.remove(6);
        arrayList.remove(new StringBuffer("BB"));
        System.out.println(arrayList);
        Object o1 = arrayList.get(7);
        arrayList.set(7,"DDdDDDD");
        System.out.println(arrayList);
    }
}