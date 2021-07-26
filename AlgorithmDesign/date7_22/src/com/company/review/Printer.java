package com.company.review;

/**
 * @program: testcode
 * @description:
 * @author: FanYang
 * @create: 2021-07-21 18:46
 */
public class Printer implements Usb {
    @Override
    public void start() {
        System.out.println("正在准备打印工作");
    }

    @Override
    public void end() {
        System.out.println("正在结束打印工作");
    }

}
