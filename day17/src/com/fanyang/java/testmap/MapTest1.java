package com.fanyang.java.testmap;

import org.junit.Test;

import java.util.*;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-10 09:45
 */
public class MapTest1 {
    @Test
    public void test1() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 18);
        Object age = map.put("age", 19);//返回替换掉的values值，没有则为null
        Object age1 = map.put("age1", 19);
        System.out.println(age);
        System.out.println(age1);
        System.out.println(map);
        map.put(null, 21);//HashMap可以存储键值对为空的元素，而Hashtable不可以
        System.out.println(map.containsKey(null));//hashMap沒有contains方法，改为了containsKey和containsValue
        System.out.println(map.containsValue(21));
        System.out.println(map.isEmpty());//false//判断集合内是否还有元素
        map.clear();//清空集合内的所有元素
        System.out.println(map.isEmpty());//true
    }
    @Test
    public void test2(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 18);
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("************");
        Collection<Object> values = map.values();
        Iterator<Object> iterator1 = values.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
