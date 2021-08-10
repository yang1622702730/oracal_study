package com.fanyang.java.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-06 14:44
 */
public class LinkedListTest {
    @Test
    public void test1() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
//        linkedList.addAll(1, Arrays.asList(1, 23, 4));
        System.out.println(linkedList.toString());
        linkedList.addFirst("start");//在第一个位置上添加元素
        linkedList.addLast("end");//在最后第一个位置上添加元素
        System.out.println(linkedList.toString());
        System.out.println(linkedList.getFirst());//获取第一个元素
        System.out.println(linkedList.getLast());//获取最后第一个元素
        System.out.println(linkedList.removeFirst());//移除第一个元素
        System.out.println(linkedList.removeLast());//移除最后一个元素

    }
}
