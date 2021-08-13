package com.fanyang.java.collection.exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-11 08:58
 */
public class Exercise13 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("张三",800);
        hashMap.put("李四",1500);
        hashMap.put("王五",3000);
        System.out.println(hashMap);
        hashMap.replace("张三",2600);
        System.out.println(hashMap);
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            Object o = hashMap.get(next);
            if (o instanceof Integer){
                Integer integer = (Integer)o;
                integer +=100;
                hashMap.put(next,integer);
            }
        }
        System.out.println(hashMap);
        System.out.println("遍历员工");
        set = hashMap.keySet();
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("遍历工资");
        Collection values = hashMap.values();
        Iterator iterator1 = values.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
