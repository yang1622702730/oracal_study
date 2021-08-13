package com.fanyang.java.collection.exercise;

import java.util.*;

/**
 * @project_name: OracleStudy
 * @project_description:  练习四：创建Set接口的实现类，添加10个以上的元素，要求能够排序。
 * @author: FanYang
 * @create_date: 2021-08-10 19:16
 */
public class Exercise4 {
    public static void main(String[] args){
        Collection set1 = new HashSet();
        set1.add(123);
        set1.add(456);
        set1.add(145325);
        set1.add(2352352);
        set1.add(235235534);
        set1.add(4423234);
        set1.add(456235);
        set1.add(45679);
        set1.add(45687989);
        set1.add(4566755);
        set1.add(4561321);
        Object[] objects = set1.toArray();
        List list = Arrays.asList(objects);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
