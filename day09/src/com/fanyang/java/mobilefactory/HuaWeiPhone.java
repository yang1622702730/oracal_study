package com.fanyang.mobilefactory;

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-29 15:10
 */
public class HuaWeiPhone extends Phone  {

    public HuaWeiPhone() {

    }

    public HuaWeiPhone(Phone phone) {
        this.setPhoneName(phone.getPhoneName());
        this.setPhoneValue(phone.getPhoneValue());
        this.setPhoneColor(phone.getPhoneColor());
    }

    public HuaWeiPhone(String phoneName, int phoneValue, String phoneColor) {
        super(phoneName, phoneValue, phoneColor);
    }

    @Override
    public void callUp() {
        System.out.println("真在使用华为手机打电话");
    }

    @Override
    public void shutdown() {
        System.out.println("真在关闭华为设备");
    }

    @Override
    public void staring() {
        System.out.println("真在重启华为设备");
    }

    @Override
    public void takeMessage() {
        System.out.println("真在使用华为手机发短信");
    }
}
