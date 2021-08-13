package com.fanyang.java.packageclass;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Test;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 10:24
 */
public class PackageClassTest1 {
    @Test
    public void packageClassTest1(){
        Integer i1 = new Integer("1");//内部会对字符串进行转换
        Integer i3 = new Integer(1);
        int i2 = 1;
        System.out.println(i1==i2);//true
        System.out.println(i3 ==i2);//true
    }

    @Test
    public void packageClassTest2(){
        Integer i1 = new Integer(1);
        int i3 = 10;
        String s1 = String.valueOf(i1);//调用String的方法valueOf把基本数据类型和包装类转化为String类型的
        String s2 = String.valueOf(i3);//调用String的方法valueOf把基本数据类型和包装类转化为String类型的
        Integer i4  = Integer.valueOf(i3);
        System.out.println(i4);
        System.out.println(s1);
        System.out.println("s2 = "+s2);
        int i2 = Integer.parseInt(s1);
        System.out.println(i2);
    }
}
