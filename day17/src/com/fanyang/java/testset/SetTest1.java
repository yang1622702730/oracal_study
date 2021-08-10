package com.fanyang.java.testset;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-10 09:19
 */
public class SetTest1 {
    @Test
    public void test1(){
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(7);
        System.out.println(hashSet);
        Object[] objects = hashSet.toArray();
        for (int i = 0; i < objects.length; i++) {//遍历集合的元素方式一
            System.out.println(objects[i]);
        }
        System.out.println("***********");
        //遍历集合的元素方式二
        for (Object o : hashSet) {
            System.out.println(o);
        }
        System.out.println("***********");
        //遍历集合的元素方式三
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
