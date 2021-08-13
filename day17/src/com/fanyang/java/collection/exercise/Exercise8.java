package com.fanyang.java.collection.exercise;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @project_name: OracleStudy
 * @project_description: 通过四种方法遍历Exercise7中的集合
 * @author: FanYang
 * @create_date: 2021-08-10 19:53
 */
public class Exercise8 {
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
        //方式一
        System.out.println("**********");
        Object[] objects = arrayList.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        //方式二
        System.out.println("**********");
        for (Object o : arrayList) {
            System.out.println(o);
        }
        //方式三
        System.out.println("**********");
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("**********");
        //方法四
        arrayList.forEach(i ->{
            System.out.println(i);
        });
    }
}
