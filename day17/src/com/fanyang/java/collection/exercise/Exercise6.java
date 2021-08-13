package com.fanyang.java.collection.exercise;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @project_name: OracleStudy
 * @project_description:    练习六：定义一个Collection接口类型的变量，引用一个List集合的实现类，实现添加单个元素，添加另一个集合，
 * 删除元素，判断集合中是否包含一个元素，判断是否为空，清除集合，返回集合里元素的个数等常用操作。
 * @author: FanYang
 * @create_date: 2021-08-10 19:33
 */
public class Exercise6 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(456);
        System.out.println(list);
        Collection list1 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list.addAll(list1);
        System.out.println(list);
        list.remove("AA");
        System.out.println(list);
        System.out.println(list.contains(123));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
