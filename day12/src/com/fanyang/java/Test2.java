package com.fanyang.java;

import org.junit.Test;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-02 16:45
 */
public class Test2 {

    /*
     * @Description: 测试各个数据类型的数组的地址返回值
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/2 16:50
     */
    @Test
    public void test() {
        int[] ints = {1, 2, 3, 4};
        char[] chars = {1, 2, 3, 4};
        byte[] bytes = {1, 2, 3, 4};
        long[] longs = {1, 2, 3, 4};
        short[] shorts = {1, 2, 3, 4};
        float[] floats = {1.1f, 2.2f};
        double[] doubles = {1.1, 2.2};
        boolean[] booleans = {false,true};
//        Boolean[] booleans1 = {false,true};
        String[] strings = {"1234", "2"};
        System.out.println(ints.toString());
        System.out.println(chars.toString());
        System.out.println(bytes.toString());
        System.out.println(longs.toString());//[J@15327b79
        System.out.println(shorts.toString());
        System.out.println(floats.toString());
        System.out.println(doubles.toString());
        System.out.println(booleans.toString());//[Ljava.lang.Boolean;@621be5d1
//        System.out.println(booleans1.toString());//[Ljava.lang.Boolean;@621be5d1
        System.out.println(strings[0].toString());//[Ljava.lang.String;@573fd745
    }
}
