package com.fanyang.mobilefactory;

import java.util.Scanner;

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-29 15:17
 */
public class ProductionPhone {
    static Scanner scanner = new Scanner(System.in);

    public static Phone productPhone(int choose) {
        Phone phone = inputInfo();
        switch (choose) {
            case 1:
//                System.out.println("请输入手机的名称");
//                String name1 = scanner.next();
//                System.out.println("请输入手机的价格");
//                int value1 = scanner.nextInt();
//                System.out.println("请输入手机的颜色");
//                String color1 = scanner.next();
//                Phone iphone = new Iphone(name1, value1, color1);
                Phone iphone = new Iphone(phone);
                return iphone;
            case 2:
                /*System.out.println("请输入手机的名称");
                String name2 = scanner.next();
                System.out.println("请输入手机的价格");
                int value2 = scanner.nextInt();
                System.out.println("请输入手机的颜色");
                String color2 = scanner.next();
                Phone huaWei = new HuaWeiPhone(name2, value2, color2);*/
                Phone huaWei = new HuaWeiPhone(phone);
                return huaWei;
            case 3:
//                System.out.println("请输入手机的名称");
//                String name3 = scanner.next();
//                System.out.println("请输入手机的价格");
//                int value3 = scanner.nextInt();
//                System.out.println("请输入手机的颜色");
//                String color3 = scanner.next();
//                Phone sanSung = new SamsungPhone(name3, value3, color3);
                Phone sanSung = new SamsungPhone(phone);
                return sanSung;
            default:
                System.out.println("没有这款产品!!!");
        }

        return null;
    }

    //    private static void productionIphone(){
////        Phone phone = new Iphone(inputInfo());
////        System.out.println(phone.toString());
////    }
    private static Phone inputInfo() {
        Phone phone = new Phone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入手机的名称");
        String name = scanner.next();
        phone.setPhoneName(name);
        System.out.println("请输入手机的价格");
        int value = scanner.nextInt();
        phone.setPhoneValue(value);
        System.out.println("请输入手机的颜色");
        String color = scanner.next();
        phone.setPhoneColor(color);
        System.out.println(phone.toString());
        return phone;
    }

//    public static void main(String[] args) {
//        ProductionPhone.productionIphone();
//    }
}
