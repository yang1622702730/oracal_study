package com.fanyang.java.collection.exercise;

import java.util.*;

/**
 * @project_name: OracleStudy
 * @project_description: 练习十七：1 ） 要求集合对象c1中，只能添加字符串形式的单个元素，元素可以重复，在测试类中为c1集合添加字符串“这是一个可以重复的集合”三遍，然后遍历打印结果。
 * 2 ）要求集合对象c2中只能添加整型数值，并且不可重复，按自然顺序排序。要求遍历集合对象，打印添加进1,2,3,4,5五个数字的c2集合
 * 3 ）要求创建一个合适的Map集合对象m1，它的键和值都只能是字符串，并且值可以是null，像map集合中添加三组字符串，其中一个只有键，值是空，遍历这个集合对象的键，并打印键。
 * 4）想办法将m1中所有值为null都替换成一个字符串”这里是空值”
 * 5）遍历m1的所有值。
 * @author: FanYang
 * @create_date: 2021-08-11 11:11
 */
public class Exercise17 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("AA");
        arrayList.add("AA");
        arrayList.add("AA");
        for (String s : arrayList) {
            System.out.println(s);
        }

        TreeSet<Integer> treeSet = new TreeSet<Integer>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer && o2 instanceof Integer){
                    Integer integer1 = (Integer)o1;
                    Integer integer2 = (Integer)o2;
                    return -Integer.compare(integer1,integer2);
                }
                return 0;
            }
        });
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(-9);
        treeSet.add(4);
        treeSet.add(-1);
        System.out.println(treeSet);


        HashMap<String,String> map = new HashMap<String,String>();
        map.put("AA","1");
        map.put("BB","2");
        map.put(null,"3");
        Set<String> set = map.keySet();
        for (String s : set) {
//            System.out.println(s);

            if (s==null){
                String s1 = map.get(s);
                map.remove(s);
                map.put("这里是空值",s1);
            }
        }
        System.out.println(map);
        set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(map.get(next));
        }
    }


}
