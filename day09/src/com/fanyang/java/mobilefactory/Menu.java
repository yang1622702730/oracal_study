package com.fanyang.mobilefactory;

import java.util.Scanner;

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-29 15:24
 */
public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static boolean flag = true;
    public static void chooseMenu(){
        System.out.println("下面将提供三款手机机型，供你选择");
        System.out.println("输入1：苹果手机");
        System.out.println("输入2：华为手机");
        System.out.println("输入3：三星手机（爆炸款）");
        int choose1 = scanner.nextInt();
        Phone phone = ProductionPhone.productPhone(choose1);
        System.out.println("现在手机的基本信息如下");
        System.out.println(phone.toString());
        System.out.println("下面可以进行操作");
        while (flag){
            operate(phone);
        }
    }
    private static void operate(Phone phone){
        System.out.println();
        System.out.println("你可以进行如下操作");
        System.out.println("操作一：开机");
        System.out.println("操作二：关机");
        System.out.println("操作三：打电话");
        System.out.println("操作四：发短信");
        System.out.println("操作五：结束程序");
        System.out.println("输入1-5作出选择");
        int choose2 = scanner.nextInt();
        switch (choose2){
            case 1:
                phone.staring();
                break;
            case 2:
                phone.shutdown();
                break;
            case 3:
                phone.callUp();
                break;
            case 4:
                phone.takeMessage();
                break;
            case 5:
                flag = false;
                break;
            default:
                System.out.println("Mistake choice!!!");
        }
    }

//    public static void main(String[] args) {
//        Menu.chooseMenu();
//    }
}
