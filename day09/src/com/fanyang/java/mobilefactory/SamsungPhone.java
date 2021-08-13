package com.fanyang.mobilefactory;

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-29 15:09
 */
public class SamsungPhone extends Phone {

    public SamsungPhone() {

    }

    public SamsungPhone(Phone phone) {
        this.setPhoneName(phone.getPhoneName());
        this.setPhoneValue(phone.getPhoneValue());
        this.setPhoneColor(phone.getPhoneColor());
    }

    public SamsungPhone(String phoneName, int phoneValue, String phoneColor) {
        super(phoneName, phoneValue, phoneColor);
    }

    @Override
    public void callUp() {
        System.out.println("真在使用三星手机打电话");
    }

    @Override
    public void shutdown() {
        System.out.println("真在关闭三星设备");
    }

    @Override
    public void staring() {
        System.out.println("真在重启三星设备");
    }

    @Override
    public void takeMessage() {
        System.out.println("真在使用三星手机发短信");
    }
}
