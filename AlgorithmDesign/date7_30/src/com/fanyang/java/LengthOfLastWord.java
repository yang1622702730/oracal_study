package com.fanyang.java;

import org.junit.Test;

/**
 * @project_name: AlgorithmDesign
 * @project_description:给你一个字符串 s，由若干单词组成，单词之间用单个或多个连续的空格字符隔开。返回字符串中最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * @author: FanYang
 * @create_date: ${}-07-30 18:34
 */
public class LengthOfLastWord {

    //自己的解法
    public int solution1(String strs) {
        String str = strs.trim(); //去掉前后的空格
        int end = str.length() - 1;
        int count = 0;
        for (int i = end; i >= 0; i--) {

            if (str.charAt(i) == ' ' && str.charAt(end) != ' ') {
//                System.out.println("aaaaa");
                return count;
            }
            count++;
        }
        if (count == str.length()) {
//            System.out.println("hhhhh");
            return count;
        }
//        System.out.println("BBBB");
        return 0;
    }


    //官方解答
    public int solution2(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) return 0;
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;
    }

    @Test
    public void test() {
        int len1 = solution1("a ");
        System.out.println(len1);
        int len2 = solution2("adasd sdasd ");
        System.out.println(len2);
    }
}

