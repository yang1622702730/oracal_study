package com.fanyang.java;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

import static java.lang.System.getenv;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-02 15:55
 */
public class Test1 {
    @Test
    public void testArrayCopy() {
        int[] src = {1, 3, 5, 7, 9};
        int[] dest = {2, 4, 6, 8, 10, 12, 14, 16};
        System.arraycopy(src, 3, dest, 5, 2);
        for (int i : src
        ) {
            System.out.println(i);
        }
//        System.exit(10);  //测试exit()这个方法
        System.out.println("**********************");
        for (int j : dest
        ) {
            System.out.println(j);
        }

    }
    /*
     * @Description: https://blog.csdn.net/jijianshuai/article/details/78863032   CSDN解析
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/2 16:24
    */
    @Test
    public void testGetenv() {
        String s1 = System.getenv("OS");
        System.out.println(s1);


        Map<String, String> map = System.getenv();
        for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "===" + entry.getValue());
        }
    }
    @Test
    public void testProperty() {
        String s1 = System.getProperty("os.name");
        String s2 = System.getProperty("os.version");
        String s3 = System.getProperty("java.home");
        String s4 = System.getProperty("user.home");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

}
