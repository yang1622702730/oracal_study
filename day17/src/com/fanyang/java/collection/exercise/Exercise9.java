package com.fanyang.java.collection.exercise;

import sun.java2d.loops.Blit;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @project_name: OracleStudy
 * @project_description:    练习九：创建LinkedList实例化对象，练习具有队列特点的方法
 * @author: FanYang
 * @create_date: 2021-08-10 20:00
 */
public class Exercise9 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(123);
        linkedList.add(456);
        linkedList.add(789);
        System.out.println(linkedList);
        linkedList.addFirst("add first");
        linkedList.addLast("add last");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.indexOf(123));
        linkedList.offer(2);
        linkedList.offerFirst("offer first");
        linkedList.offerLast("offer last");
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(123);
        linkedList1.add(456);
        linkedList1.add(78951);
        System.out.println(linkedList);
        linkedList.retainAll(linkedList1);
        System.out.println(linkedList);//返回linkedList中包含linkedList1中元素的集合
    }

}
