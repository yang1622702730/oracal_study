package com.fanyang.java.collection.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @project_name: OracleStudy
 * @project_description: 练习一：定义一个Collection接口类型的变量，引用一个Set集合的实现类，实现添加单个元素，
 * 添加另一个集合，删除元素，判断集合中是否包含一个元素，判断是否为空，清除集合，返回集合里元素的个数等常用操作。
 * @author: FanYang
 * @create_date: 2021-08-10 18:59
 */
public class Exercise1 {
    public static void main(String[] args) {
        Collection set1 = new HashSet();
        set1.add(123);
        set1.add(456);
        System.out.println(set1);
        Collection set2 = new HashSet();
        set2.add(678);
        set2.add(867);
        set2.add(789);
        set1.addAll(set2);
        System.out.println(set1);
        boolean remove = set1.remove(123);
        System.out.println("remove = "+remove);
        boolean contains = set1.contains(456);
        System.out.println("contains = "+contains);
        System.out.println(set1.isEmpty());
        System.out.println(set1.size());
        set1.clear();
        System.out.println(set1.isEmpty());
        System.out.println(set1.size());
    }
}
