package com.fanyang.mobilefactory;

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-29 15:10
 */
public class Iphone extends Phone{
    public Iphone() {

    }

    public Iphone(Phone phone) {
        this.setPhoneName(phone.getPhoneName());
        this.setPhoneValue(phone.getPhoneValue());
        this.setPhoneColor(phone.getPhoneColor());
    }

    public Iphone(String phoneName, int phoneValue, String phoneColor) {
        super(phoneName, phoneValue, phoneColor);
    }

    @Override
    public void callUp() {
        System.out.println("真在使用苹果手机打电话");
    }

    @Override
    public void shutdown() {
        System.out.println("真在关闭苹果设备");
    }

    @Override
    public void staring() {
        System.out.println("真在重启苹果设备");
    }

    @Override
    public void takeMessage() {
        System.out.println("真在使用苹果手机发短信");
    }
}
