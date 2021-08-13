package com.fanyang.java.collection.exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @project_name: OracleStudy
 * @project_description: 练习十二：封装一个新闻类，包含标题、作者、新闻内容和发布时间，新闻标题如下：
 * @author: FanYang
 * @create_date: 2021-08-11 08:51
 */
public class Exercise12 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Journalism("中国多地遭雾霾笼罩空气质量再成热议话题"));
        arrayList.add(new Journalism("民进党台北举行“火大游行"));
        arrayList.add(new Journalism("春节临近北京“卖房热"));
        arrayList.add(new Journalism("春节临近北京“卖房热"));
        System.out.println(arrayList);
        System.out.println(arrayList.get(0).equals(arrayList.get(1)));
        System.out.println(arrayList.get(2).equals(arrayList.get(3)));
        Object[] objects = arrayList.toArray();
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        System.out.println(hashSet);
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(arrayList.size());
        System.out.println(hashSet.size());
    }
}
