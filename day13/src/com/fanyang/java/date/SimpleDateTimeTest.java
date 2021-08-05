package com.fanyang.java.date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 20:25
 */
public class SimpleDateTimeTest {
    @Test
    public void test() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat1.format(date));
        System.out.println(simpleDateFormat1.parse("2020-08-03 08:33:08"));
        System.out.println(simpleDateFormat.parse("21-8-3 下午8:29"));
        System.out.println(simpleDateFormat.toPattern());
    }
}
