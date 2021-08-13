package com.fanyang.java.collection.exercise;

import java.util.Arrays;
import java.util.List;

/**
 * @project_name: OracleStudy
 * @project_description:    练习十八：以下代码的运行结果
 * @author: FanYang
 * @create_date: 2021-08-11 11:49
 */
public class Exercise18 {
    public static void main(String[] args) {
        Integer[] data = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(data);
        System.out.println(list);
        list.add(5);
        System.out.println(list.size());
    }

}
