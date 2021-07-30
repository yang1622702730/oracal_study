package com.fanyang.java.test.interfacepackage;/**
 * @author fanYang
 * @create 2021-07-28 14:22
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 14:22
 */
public class Computer{
    public void transferData(Usb usb){
        usb.start();
        System.out.println("具体的传输细节");
        usb.stop();
    }
}
