package com.fanyang.java.exercise2;

import java.util.Scanner;

/**
 * @program: OracleStudy
 * @description: 测试
 * @author: FanYang
 * @create: 2021-07-27 09:40
 */
public class Client {
    public static void operate() {
        boolean flag = true; //方式二
        Scanner scanner = new Scanner(System.in);
        OperateUser operateUser = new OperateUser();
        System.out.println("我们公司支持ORACLE和MYSQL两种数据库，请输入根据情况选择数据库类型");
        String databaseType = scanner.next();
        UserManager userManager = operateUser.setUserManager(databaseType);
        System.out.println("                选择成功，下面将进行CRUD具体操作  ");
        while (flag) {
            System.out.println();
            System.out.println("              下面将提供一些选项操作用户表");
            System.out.println("输入1：添加用户                     输入2：修改用户");
            System.out.println("输入3：删除用户                     输入4：查询指定用户");
            System.out.println("输入5：查询所有用户                 输入6：为用户添加最喜欢的书籍");
            System.out.println("输入7：查询指定用户的书籍信息        输入8：退出程序");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("请根据如下提示添加新的用户信息");
                    User user1 = userManager.inputInfo();
                    userManager.add(user1);
                    break;
                case 2:
                    System.out.println("请根据如下提示输入更改的用户信息");
                    User user2 = userManager.inputInfo();
                    userManager.update(user2, user2.getId());
                    break;
                case 3:
                    System.out.println("请输入要删除的用户ID");
                    int id3 = scanner.nextInt();
                    userManager.delete(id3);
                    break;
                case 4:
                    System.out.println("请输入要查询的用户ID");
                    int id4 = scanner.nextInt();
                    System.out.println("正在进行查询用户ID为" + id4 + "的用户");
                    userManager.getOne(id4);
                    System.out.println("查询结束");
                    break;
                case 5:
                    System.out.println("正在查询所有的用户信息");
                    User[] users = userManager.getAllUser();
                    if (0 == UserManager.i) {
                        System.out.println("用户表中没有任何的数据");
                    }
                    System.out.println("查询结束，正在退出查询");
                    break;
                case 8:
                    flag = false;
                    System.out.println("真在结束程序");
                    break;
                case 6:
                    System.out.println("请输入需要添加书籍的用户ID");
                    int index = scanner.nextInt();
                    Book book = new Book();
                    userManager.addBook(index);
                    break;
                case 7:
                    System.out.println("请输入要打印的用户书籍信息的拥有者ID");
                    int index1 = scanner.nextInt();
                    userManager.printBookInfo(index1);
                    break;
                default:
                    System.out.println("输入的值超出范围，请重新选择");
            }

        }

    }
}
