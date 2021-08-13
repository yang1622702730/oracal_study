package com.fanyang.java.exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-11 14:31
 */
public class ChooseMonkeyKing {
    public static void main(String[] args) {
        int monkeyNumber = 10;//猴子的个数
        int deleteNumber = 3;//报数为3则剔除队伍
        Map map = new LinkedHashMap();
        int index = 1; // 猴子的位置编号
        int numberOff = 1; // 报数号
        for (int i = 1; i < monkeyNumber + 1; i++) {//把猴子的位置存到map中
            map.put(i, i);
        }
        System.out.println(map);
        while (map.size() > 1) {//只剩一只猴子的时候退出循环，他就是猴王
            if (numberOff == 3) {//当猴子报数为3时，则把它移除map
                map.remove(index);
            }
            index++;
            if (index == monkeyNumber + 1) {//当走完一轮之后又从第一个猴子哪儿开始报数
                index = 1;
            }
            if (map.get(index) != null) {//猴子移除后它将指向null,我们此时只计算还没有被剔除掉的猴子，因而他就不计入报数的范畴内了
                numberOff++;
            }
            if (numberOff == deleteNumber + 1) {//上一个猴子报数为3时，下一个猴子报数从1开始
                numberOff = 1;
            }
        }
        System.out.println(map);
        Set set = map.keySet();
        System.out.println("猴王的编号为"+set.toString());
    }
}
