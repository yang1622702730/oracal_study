package com.fanyang.java.review;

/**
 * @program: testcode
 * @description:
 * @author: FanYang
 * @create: 2021-07-21 18:45
 */
public class Flash implements Usb {
    @Override
    public void start() {
        System.out.println("正在读取U盘");
    }

    @Override
    public void end() {
        System.out.println("正在关闭u盘");
    }
}
