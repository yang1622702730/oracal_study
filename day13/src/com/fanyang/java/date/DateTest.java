package com.fanyang.java.date;

import org.junit.Test;

import java.util.Date;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 20:20
 */
public class DateTest {
    @Test
    public void test1(){
        Date date = new Date();
        Date date1 = new Date(2020-1900, 1, 1);
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date.before(date1));
        System.out.println(date.after(date1));
        System.out.println(date.compareTo(date1));
        System.out.println(date.getDate());
        date.setDate(4);
        System.out.println(date.getDate());
    }
}
