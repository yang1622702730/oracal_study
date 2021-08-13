package com.fanyang.java.collection.exercise;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @project_name: OracleStudy
 * @project_description:    练习十：存储新闻标题和内容测试
 * @author: FanYang
 * @create_date: 2021-08-10 20:14
 */
public class Exercise10 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("中国多地遭雾霾笼罩空气质量再成热议话题"));
        arrayList.add(new News("春节临近北京“卖房热"));
        ListIterator listIterator = arrayList.listIterator();
        while(listIterator.hasNext()){
            Object next = listIterator.next();
            if (next instanceof News){
                News news = (News)next;
                if (news.getTitle().length()>=15){
                    System.out.println(news.getTitle());
                    String[] split = news.getTitle().split("(\\w){3}");
                    for (int i = 0; i < split.length; i++) {
                        System.out.print(split[i]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
