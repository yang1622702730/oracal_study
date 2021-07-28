package com.fanyang.java.databases;

import java.util.Scanner;

/**
 * @program: OracleStudy
 * @description: 子类去重写，实现父类中的方法
 * @author: FanYang
 * @create: 2021-07-27 09:32
 */
public class UserManagerForMysql extends DataStore implements UserManager{
    public static User[] users = new User[20];
//    public static int i = 0;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add(User user) {
        user.setTypes("MYSQL");
        users[i] = user;
        i++;
        System.out.println("成功添加第" + i + "个用户");
        System.out.println("真在打印添加新用户后的用户表");
        printTableInfo();
    }

    @Override
    public void update(User user, int id) {
        user.setTypes("MYSQL");
        boolean flag = true;
        for (int j = 0; j < i; j++) {
            if (id == users[j].getId()) {
                users[j] = user;
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("没有找到你输入的这个用户ID，请重新选择");
        } else {
            System.out.println("打印修改信息后的现有用户表");
            printTableInfo();
        }
    }

    @Override
    public void delete(int id) {
        System.out.println("真在查找删除的用户");
        boolean flag = true;
        for (int j = 0; j < i; j++) {
            if (id == users[j].getId()) {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("没有找到你输入的这个用户ID，请重新选择");
            return;
        }
        for (int j = id - 1; j < i - 1; j++) {
            users[j] = users[j + 1];
        }
        System.out.println("删除成功");
        i--;
        System.out.println("真在打印删除后的用户表");
        printTableInfo();
    }

    @Override
    public User getOne(int id) {
        for (int j = 0; j < i; j++) {
            if (id == users[j].getId()) {
                System.out.println(users[j].toString());
                return users[j];
            }
        }
        System.out.println("没有这个用户,请重新作出选择");
        return null;
    }

    @Override
    public User[] getAllUser() {
        printTableInfo();
        return users;
    }

    @Override
    public void printTableInfo() {
        for (int k = 0; k < i; k++) {
            System.out.println(users[k].toString());
        }
    }
}
