package com.company.test;

/**
 * @program: testcode
 * @description:最长公共前缀
 * @author: FanYang
 * @create: 2021-07-22 17:20
 */
public class LongestPrefix {
    public static String longestPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        //先找到最短的字符串
        String minimumStr = str[0];
        for (int i = 0; i < str.length; i++) {
            if (minimumStr.length() > str[i].length()) {
                minimumStr = str[i];
            }
        }
        int lengths = minimumStr.length();
        int count = str.length;
        for (int i = 0; i < lengths; i++) {
            char ch = minimumStr.charAt(i);
            for (int j = 0; j < count; j++) {
                if (ch != str[j].charAt(i)) {
                    if (i == 0) {
                        return "";
                    }
                    return minimumStr.substring(0, i);
                }
            }
        }
        /*int lengths = str[0].length();
        int count = str.length;
        for (int i = 0; i < lengths; i++) {
            char ch = str[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (ch != str[j].charAt(i) || i == str[j].length()) {
                    return str[0].substring(0,i);
                }
            }
        }*/
        return minimumStr;
    }

    public static void main(String[] args) {
        System.out.println(LongestPrefix.longestPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
