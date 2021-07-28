package com.fanyang.java.interfacepackage;/**
 * @author fanYang
 * @create 2021-07-28 14:23
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 14:23
 */
public class Flash implements Usb{
    @Override
    public int start() {
        System.out.println("U盘开始工作");
        return 0;
    }

    @Override
    public int stop() {
        System.out.println("U盘结束工作");
        return 0;
    }
}
