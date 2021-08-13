package com.fanyang.java.collection.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @project_name: OracleStudy
 * @project_description: 练习十六：1 ）封装一个汽车类，包含String  name、int  speed属性，在测试类中实例化三个对象：c1，c2，c3，分别设置name为：“奥拓”，“宝马”，“奔驰”，速度分别设置为：100,200,300
 * 2 ）使用Map集合对象m1将这三个汽车类对象保存成key，然后将int型的汽车价钱作为值保存在m1的value中，上述三款汽车分别对应的价钱是10000,500000,2000000
 * 3 ）遍历m1的键，打印name属性
 * 4 ）通过合适的方法，求出m1中“宝马”的价格，并打印结果；
 * 5 ）经过折旧，所有汽车都降价到原来的80%，请打印降价后“宝马”的价格
 * @author: FanYang
 * @create_date: 2021-08-11 10:52
 */
public class Exercise16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(new NewCar("奥拓", 100), 10000.0);
        map.put(new NewCar("宝马", 200), 500000.0);
        map.put(new NewCar("奔驰", 300), 2000000.0);
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next instanceof NewCar) {
                NewCar newCar = (NewCar) next;
                String name = newCar.getName();
                System.out.println(name);
                if ("宝马".equals(name)) {
                    System.out.println("宝马的价格为" + map.get(next));
                }
            }
        }
        //降价处理
        iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next instanceof NewCar) {
                NewCar newCar = (NewCar) next;
                Object o = map.get(newCar);
                if (o instanceof Double) {
                    Double double1 = (Double) o;
                    double1 *= 0.2;
                    map.put(newCar, double1);
                }
            }
        }
        System.out.println(map);
    }
}
