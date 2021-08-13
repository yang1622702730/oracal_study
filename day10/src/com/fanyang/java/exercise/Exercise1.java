package com.fanyang.java.exercise;

import org.junit.Test;

import java.nio.charset.Charset;

/**
 * @program: OracleStudy
 * @description: 实现两个方法 1.首字母转大写==>goudan ==> Goudan
 * 2.大驼峰命名，字符串中含有下划线，则去掉下划线，后一个转大写 gou_dan为GouDan
 * @author: FanYang
 * @create: 2021-07-30 11:19
 */
public class Exercise1 {

    /*
     * @Description: 把首字母转大写==>goudan ==> Goudan
     * @Param:s1
     * @return:String
     * @author: FanYang
     * @time: 2021/7/30 11:19
     */
    public static String changeFirstToUp(String s1) {
        String firstChar = s1.substring(0, 1);//分割第一个字符
        String otherChar = s1.substring(1);//分割其余字符
        String upFirstChar = firstChar.toUpperCase();//把第一个字符转化为大写
//        System.out.println(upFirstChar);
//        System.out.println(otherChar);
        String finalString = upFirstChar.concat(otherChar);//拼接转化的第一个字符和其余字符
//        System.out.println(finalString);
        return finalString;
//        if ()
//        String s2 = s1.replace(firstChar,)
    }

    /*
     * @Description:  驼峰命名，字符串中含有下划线，则去掉下划线，后一个转大写 gou_dan为GouDan
     * @Param: [s2]
     * @return: String
     * @author: FanYang
     * @time: 2021/7/30 11:47
     */
    public static String nameBigHump(String s2) {
        String[] strings = s2.split("_");
        String changeString = "";
        for (int i = 0; i < strings.length; i++) {
            String finalString = changeFirstToUp(strings[i]);
            changeString += finalString;
        }
//        System.out.println(changeString);
        return changeString;
    }


    /*
     * @Description: 测试首字母改为大写
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/30 11:52
     */
    @Test
    public void testChangeFirstToUp() {
        String newString = changeFirstToUp("goudan");
        System.out.println(newString);

    }

    /*
     * @Description: 测试把任意的字符串转化为驼峰的形式
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/30 11:53
     */
    @Test
    public void testBigHump() {
        String changeString = nameBigHump("gou_dan_dan_dan_dan");
        System.out.println(changeString);
    }
}
