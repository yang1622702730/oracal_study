package com.fanyang.java.test.database;
import java.util.Scanner;

/**
 * @program: OracleStudy
 * @description: 测试
 * @author: FanYang
 * @create: 2021-07-27 09:40
 */
public class Client {
    public static void main(String[] args) {
//        OperateUser operateUser = new OperateUser();
//        UserManager userManager1 = operateUser.setUserManager("oracle");
//        UserManager userManager2 = operateUser.setUserManager("mysql");
//        User user1 = new User();
//        user1.setId(1);
//        user1.setUserName("杨凡");
//        user1.setBirthday("1999-10-15");
//        userManager1.add(user1);
//        User user2 = new User(2,"鱼儿","2000-2-16");
//        userManager2.add(user2);
/*        boolean flag = true; //方式一
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();*/



        boolean flag = true; //方式二
        Scanner scanner = new Scanner(System.in);
        OperateUser operateUser = new OperateUser();
        System.out.println("我们公司支持ORACLE和MYSQL两种数据库，请输入根据情况选择数据库类型");
        String databaseType = scanner.next();
        UserManager userManager = operateUser.setUserManager(databaseType);
        System.out.println("选择成功，下面将进行CRUD具体操作");
//        UserManager userManager = operateUser.setUserManager("MYSQL");
        while (flag) {
            System.out.println();
            System.out.println("下面将提供一些选项操作用户表");
            System.out.println("输入1：添加用户        输入2：修改用户");
            System.out.println("输入3：删除用户        输入4：查询指定用户");
            System.out.println("输入5：查询所有用户     输入6：退出程序");
            int choose = scanner.nextInt();
            switch(choose){
                case 1:
                    System.out.println("请根据如下提示添加新的用户信息");
                    User user1 = userManager.inputInfo();
                    userManager.add(user1);
                    break;
                case 2:
                    System.out.println("请根据如下提示输入更改的用户信息");
                    User user2 = userManager.inputInfo();
                    userManager.update(user2,user2.getId());
                    break;
                case 3:
                    System.out.println("请输入要删除的用户ID");
                    int id3 = scanner.nextInt();
                    userManager.delete(id3);
                    break;
                case 4:
                    System.out.println("请输入要查询的用户ID");
                    int id4 = scanner.nextInt();
                    System.out.println("正在进行查询用户ID为"+id4+"的用户");
                    userManager.getOne(id4);
                    System.out.println("查询结束");
                    break;
                case 5:
                    System.out.println("正在查询所有的用户信息");
                    User[] users =userManager.getAllUser();
                    if (0==UserManager.i){
                        System.out.println("用户表中没有任何的数据");
                    }
                    System.out.println("查询结束，正在退出查询");
                    break;
                case 6:
                    flag = false;
                    System.out.println("真在结束程序");
                    break;
                default:
                    System.out.println("输入的值超出范围，请重新选择");
            }

        }

    }
}
