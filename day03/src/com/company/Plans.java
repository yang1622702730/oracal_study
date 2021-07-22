package com.company;

import java.util.Scanner;

/**
 * @program: day03
 * @description: 根据天气安排计划
 * @author: FanYang
 * @create: 2021-07-21 10:59
 */
public class Plans {
    public void useIfPlanWOrk(String weather){
        if (weather.equals("晴天")){
            System.out.println("去图书馆看书");
        }
        else if (weather.equals("多云")){
            System.out.println("和朋友去爬山");
        }
        else if (weather.equals("阴天")){
            System.out.println("和朋友去钓鱼");
        }
        else if (weather.equals("雨天")){
            System.out.println("在寝室睡大觉");
        }
        else{
            System.out.println("这种天气不知道干什么");
        }
    }
    public void useSwitchPlanWork(String weather){
        switch (weather){
            case "晴天":
                System.out.println("去图书馆看书");
                break;
            case "多云":
                System.out.println("和朋友去爬山");
                break;
            case "阴天":
                System.out.println("和朋友去钓鱼");
                break;
            case "雨天":
                System.out.println("在寝室睡大觉");
                break;
            default:
                System.out.println("这种鬼天气不知道干什么");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入今天的天气情况");
        String weather = scanner.next();
        Plans plans = new Plans();
        plans.useIfPlanWOrk(weather);
        plans.useSwitchPlanWork(weather);
    }
}
