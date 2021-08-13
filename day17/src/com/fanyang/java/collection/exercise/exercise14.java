package com.fanyang.java.collection.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @project_name: OracleStudy
 * @project_description: 练习十四：创建一个List集合的对象，添加几个数字，反转对象中元素的顺序；根据元素的自然顺序排序；
 *                                创建一个List集合的对象，添加几个字符串，反转对象中元素的顺序；根据元素的自然顺序排序；
 *                                创建一个List集合的对象，添加几条数据，将1号位和2号位交换；获得最大值，最小值，
 * @author: FanYang
 * @create_date: 2021-08-11 10:30
 */
public class exercise14 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(-1);
        System.out.println(arrayList);
        Collections.reverse(arrayList);//反转
        System.out.println(arrayList);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);//自然排序
        Collections.sort(arrayList, new Comparator<Object>() {//定制排序的方式
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer &&o2 instanceof Integer){
                    Integer integer1 = (Integer)o1;
                    Integer integer2 = (Integer)o2;
                    return -Integer.compare(integer1,integer2);
                }
                return 0;
            }
        });
        System.out.println(arrayList);

        Collections.swap(arrayList,1,2);//交换指定位置的元素
        System.out.println(arrayList);
        System.out.println(Collections.max(arrayList));//利用Collections返回列表中的最大值
        System.out.println(Collections.min(arrayList));//利用Collections返回列表中的最小值
    }
}
