package com.fanyang.java.test.interfacepackage;/**
 * @author fanYang
 * @create 2021-07-28 14:24
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 14:24
 */
public class Test {
    public static void main(String[] args) {
        Usb printer = new Printer();
        Usb flash = new Flash();
        Computer computer = new Computer();
        computer.transferData(printer);
        System.out.println();
        computer.transferData(flash);
    }


}
