/*
package com.fanyang.java.honorofking.Menu;

import com.fanyang.java.honorofking.yeguai.*;

import java.util.Scanner;

public class Menuyeguai {
    //刷野菜单
    public static  int Menuyeguai(){
        System.out.println("******选择要攻击的野怪******");
        System.out.println("1.野猪");
        System.out.println("2.小鸟");
        System.out.println("3.河蟹");
        System.out.println("4.小兵");
        System.out.println("5.炮车");
        System.out.println("6.红buff");
        System.out.println("7.蓝buff");
        System.out.println("10.进入技能页面");
        System.out.println("11.进入装备页面");
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        switch (res){
            case 1: yeguai.Pig pig = new yeguai.Pig(); return pig.getNum();
            case 2:
                yeguai.Bird bird = new yeguai.Bird();return bird.getNum();
            case 3:
                yeguai.Heixie heixie = new yeguai.Heixie();return heixie.getNum();
            case 4:
                yeguai.Xiaobing xiaobing = new yeguai.Xiaobing();return xiaobing.getNum();
            case 5:
                yeguai.Paocar paocar = new yeguai.Paocar();return  paocar.getMoney();
            case 6:return 1;
            case 7:return 0;
            case 10:return 10;
            case 11:return 11;
            default:
                System.out.println("无效操作"); return 12;
        }
    }
}
*/
