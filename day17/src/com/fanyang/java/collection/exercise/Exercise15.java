package com.fanyang.java.collection.exercise;

import java.util.*;

/**
 * @project_name: OracleStudy
 * @project_description:    练习十五：1.	生成10个随机数，值在100到200之间；
 *                                   2.	将这十个数存入HashSet集合中（有可能集合的长度小于10）。
 *                                   3.	将这个HashSet集合转换成ArrayList集合
 *                                   4.	重新为ArrayList集合排序，按照从小到大的顺序；
 *                                   5.	使用foreach遍历集合；
 * @author: FanYang
 * @create_date: 2021-08-11 10:41
 */
public class Exercise15 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Random random = new Random();
        for (int i = 0; i < 10;) {
            int i1 = random.nextInt(101) + 100;
            boolean add = hashSet.add(i1);
            if (add ==true){
                i++;
            }
        }
        System.out.println(hashSet);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hashSet);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
