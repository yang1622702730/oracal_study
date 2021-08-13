package com.fanyang.java.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-04 10:30
 */
public class RegexpTest1 {
    @Test
    public void test1(){
        String s1 = "ABCDEFGabcdefg\"\"*";
//        Pattern pattern = Pattern.compile("[ABC]");//匹配ABC的字符
//        Pattern pattern = Pattern.compile("[^ABC]");//匹配非ABC的字符
//        Pattern pattern = Pattern.compile("[A-Z]");//匹配大写字母
//        Pattern pattern = Pattern.compile("[A-Z,a-b]");//打印大小写字母
        Pattern pattern = Pattern.compile("[A-Z,a-b,\",\\,*]");
        Matcher matches = pattern.matcher(s1);
        System.out.println(matches.matches());
        while (matches.find()){
            System.out.print(matches.group());
        }
    }
    @Test
    public void test2(){
        String s1 = "foooooopppppd";
//        Pattern compile = Pattern.compile("o*");
//        Pattern compile = Pattern.compile("o+");
//        Pattern compile = Pattern.compile("o{0,}");
        Pattern compile = Pattern.compile("o{1,}");//期望o至少有一个
//        Pattern compile = Pattern.compile("[fopd]{1,}");期望fopd这些元素至少有一个
        Matcher matcher = compile.matcher(s1);
        System.out.println(matcher.matches());
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
    @Test
    public void test3(){
        String str = "Windows 95";
//        Pattern compile = Pattern.compile("Windows (?=95|10|8|9)");//第一种方式不可以
//        Pattern compile = Pattern.compile("Windows (95|10|8|9=?)");
//        Pattern compile = Pattern.compile("Windows (95|10|8|9?)");
        Pattern compile = Pattern.compile("Windows (95|10|8|9)");
        Matcher matcher = compile.matcher(str);
        System.out.println(matcher.matches());
        while(matcher.find()){
            System.out.println(matcher.group(1));
        }
    }
    @Test
    public void test4(){
        String str = "97Windows";
        Pattern compile = Pattern.compile("\\d{2}Windows");
        Matcher matcher = compile.matcher(str);
        System.out.println(matcher.matches());
    }
}
