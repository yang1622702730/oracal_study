package com.fanyang.java.collection.exercise;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @project_name: OracleStudy
 * @project_description:   练习五：创建Car类，包含name，price属性，构造器等方法，创建测试类，在main方法中创建Set接口的
 * 实现类，添加5个以上的Car对象，遍历集合元素，验证重复元素是否过滤了；如果没有过滤，实现过滤功能；把每个小车的price降10000
 * 元，再遍历，查看price是否已改变
 * @author: FanYang
 * @create_date: 2021-08-10 19:21
 */
public class Exercise5 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Car("别克",30));
        set.add(new Car("奔驰",60));
        set.add(new Car("宝马",60));
        set.add(new Car("玛莎拉蒂",200));
        set.add(new Car("别克",30));
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
            if (next instanceof Car){
                Car car = (Car)next;
                car.setCarPrice(car.getCarPrice()-1);
            }
        }
        Iterator iterator1 = set.iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
