package com.fanyang.java.test.interfacepackage;/**
 * @author fanYang
 * @create 2021-07-28 14:23
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 14:23
 */
public class Printer implements Usb {
    @Override
    public int start() {
        System.out.println("打印机开始工作");
        return 0;
    }

    @Override
    public int stop() {
        System.out.println("打印机结束工作");
        return 0;
    }
}
