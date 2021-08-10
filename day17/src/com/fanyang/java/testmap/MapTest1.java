package com.fanyang.java.testmap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-10 09:45
 */
public class MapTest1 {
    @Test
    public void test1(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",18);
        map.put("age",19);
        System.out.println(map);
    }
}
