package com.fanyang.java.list;

import org.junit.Test;

import java.util.Vector;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-06 14:22
 */
public class VectorTest {
    @Test
    public void test1(){
        Vector vector = new Vector();//默认的容器大小为10，如需扩容每次扩容倍数为现有大小的两倍
//        Vector vector = new Vector(1,20);//初始化长度为1,又因为设置了每次扩容20，每次扩容后的大小为当前容器大小+20，如若addAll的值太大，则扩容为当前容器
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.addElement(1);//添加元素，等同于add方法
        vector.insertElementAt(20,0);//指定索引插入元素
        vector.add(30);
        vector.setElementAt(100,2);//指定索引设置新的值,类似于set这个方法，但参数顺序相反
        vector.removeElement(1);//移除第一次出现的这个元素，类似于remove(object o)这个方法
        System.out.println(vector.toString());
        vector.removeAllElements();//移除所有的元素,类似于clear这个方法
//        vector.clear();
        System.out.println(vector.toString());
    }
}
