package com.fanyang.mobilefactory;

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-29 15:05
 */
public  class Phone implements OperatePhoneMethod{
    private String phoneName;
    private int phoneValue;
    private String phoneColor;

    public Phone() {
    }

    public Phone(String phoneName, int phoneValue, String phoneColor) {
        this.phoneName = phoneName;
        this.phoneValue = phoneValue;
        this.phoneColor = phoneColor;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getPhoneValue() {
        return phoneValue;
    }

    public void setPhoneValue(int phoneValue) {
        this.phoneValue = phoneValue;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneName='" + phoneName + '\'' +
                ", phoneValue=" + phoneValue +
                ", phoneColor='" + phoneColor + '\'' +
                '}';
    }





    @Override
    public void callUp() {

    }

    @Override
    public void shutdown() {

    }

    @Override
    public void staring() {

    }

    @Override
    public void takeMessage() {

    }
}
