package com.fanyang.java.collection.exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @project_name: OracleStudy
 * @project_description: 练习十一：定义一个Map接口类型的变量，引用一个实现类，添加键值对，判断集合中是否包含某一key值，通过某一
 * key值得到value值，通过某一key删除键值对，把另一个map集合添加到此map集合，判断是否为空，清除集合，返回集合里元素的个数等常用操作。
 * @author: FanYang
 * @create_date: 2021-08-10 20:34
 */
public class Exercise11 {
    public static void main(String[] args) {
//        HashMap hashMap = new HashMap();
//        hashMap.put("AA",1);
//        hashMap.put("BB",2);
//        hashMap.put("CC",3);
//        System.out.println(hashMap.get("AA"));
//        System.out.println(hashMap);
//        hashMap.remove("AA");
//        System.out.println(hashMap);
//        HashMap hashMap1 = new HashMap();
//        hashMap1.put("DD",4);
//        hashMap1.put("EE",5);
//        hashMap.putAll(hashMap1);
//        System.out.println(hashMap);
//        System.out.println(hashMap.isEmpty());
//        hashMap.clear();
//        System.out.println(hashMap.size());
        HashMap hashMap2 = new HashMap();
        Object object = new Object();
//        hashMap2.put(new Employee("Tom",10000),1);
//        hashMap2.put(new Employee("Jack",5000),1);
//        hashMap2.put(new Employee("Rose",900),1);
//        hashMap2.put(new Employee("Mick",900),1);
        hashMap2.put("Tom", 10000.1);
        hashMap2.put("Jack", 5000.0);
        hashMap2.put("Rose", 900.0);
        hashMap2.put("Mick", 900.0);
        hashMap2.put("Toms", 1000.0);
        System.out.println(hashMap2);
        Set set = hashMap2.keySet();
        System.out.println(set);
        Set set1 = hashMap2.entrySet();
        System.out.println(set1);
        hashMap2.remove("Tom");
        System.out.println(hashMap2);
        Object o = hashMap2.get("Jack");
        if (o instanceof Integer) {
            Integer integer = (Integer) o;
            integer -= 1000;
            System.out.println(integer);
            hashMap2.put("Jack", integer);
        }
        System.out.println(hashMap2);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
//            System.out.println(next);
//            System.out.println(hashMap2.get(next));
            Object o1 = hashMap2.get(next);
            if (o1 instanceof Double) {
                Double double1 = (Double) o1;
//                System.out.println(double1);
                if (double1 < 1000) {
                    double1 += double1 * (0.2);
                    hashMap2.put(next, double1);
                }
            }
        }
        System.out.println(hashMap2);
    }

}
