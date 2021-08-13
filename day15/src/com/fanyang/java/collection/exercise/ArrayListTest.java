package com.fanyang.java.collection.exercise;

import com.fanyang.java.arrays.ArraysTest1;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-05 10:48
 */
public class ArrayListTest {
    @Test
    public void test1(){
//        List list = new ArrayList();
        List list = new ArrayList(100);//指定长度
        System.out.println(list.size());//0
        list.add(new ArraysTest1());
        list.add(1);
        System.out.println(list.size());//2
        System.out.println(list.get(0));//get方法获取指定索引存储的值，对象地址等
        System.out.println(list.get(1));//get方法获取指定索引存储的值，对象地址等
//        System.out.println(list.get(2));没有超出存储范围的值，但是他目前只存储了两个值，ArrayList对其进行了处理，会对没存储的索引值抛出异常
        Object object = list.get(0);
        if (object instanceof ArraysTest1) {
            ArraysTest1 arraysTest1 = (ArraysTest1) object;
            System.out.println("成功转换");
        }
    }
    @Test
    public void test2(){
        List list1 = new ArrayList();//初始长度为0
        list1.add(1);//这儿设置默认长度为10
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        List list2 = new ArrayList(10);//设置数组的初始长度为10
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.addAll(list1);//这儿把list1这个数组的十个元素全都添加到list2这个数组内部，由于list2的数组初始长度设置为10，
                            // 前面已经使用了6个，这儿addAll一下子添加了10个元素，因而需要对其进行扩容，扩容的主要操作是
                            //源码为：  int newCapacity = oldCapacity + (oldCapacity >> 1);
                            //         if (newCapacity - minCapacity < 0)
                            //            newCapacity = minCapacity;
                            //         就这个题来看的话newCapacity经过第一个操作得到15，然而第二个if语句判断为15-16<0，
                            //          所以newCapacity重新赋值为16，因而会重新创建一个数组长度为16的数组，并把旧的值复制进去

    }
}
