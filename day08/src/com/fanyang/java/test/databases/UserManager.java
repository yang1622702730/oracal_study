package com.fanyang.java.test.databases;

import java.util.Scanner;

/**
 * @program: OracleStudy
 * @description: 父类通常情况下只定义了规范，具体的实现方式，要由子类重写方法
 * @author: FanYang
 * @create: 2021-07-27 09:25
 */
public interface UserManager{
    void add(User user);//抽象方法，需要在实现类中进行重写

    void update(User user, int id);

    void delete(int id);

    User getOne(int id);

    User[] getAllUser();

    void printTableInfo();

    default User inputInfo() { //默认方法
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户ID");
        int id = scanner.nextInt();
        System.out.println("请输入用户名字");
        String name = scanner.next();
        System.out.println("请输入用户生日");
        String birthday = scanner.next();
        return new User(id, name, birthday);
    }
}
