package com.fanyang.java.date;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 14:55
 */
public class CalenderTest {
    @Test
    public void test1(){
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getTime());
        System.out.println(instance.getWeekYear());
        System.out.println(instance.getWeeksInWeekYear());
        System.out.println(instance.getFirstDayOfWeek());
        instance.set(Calendar.YEAR,2020);//重新设置年份
        System.out.println(instance.getTime());
        instance.set(2025,5,1);//重新设置年月日
        System.out.println(instance.getTime());
        Date date = new Date();
        instance.setTime(date);//通过现在获取到的Date示例去设置日期
        System.out.println(instance.getTime());
        Calendar instance1 = Calendar.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance1.before(instance));//比较日前的先后，前面大为true,反之false
}
    @Test
    public void test2(){
        Calendar instance = Calendar.getInstance();
        instance.set(2025,11,5,10,50,59);
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.HOUR));
        System.out.println(instance.get(Calendar.MINUTE));
        System.out.println(instance.get(Calendar.SECOND));
        System.out.println(instance.getTime());

    }
}
