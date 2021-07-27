package com.fanyang.java.database;

import java.util.Scanner;

/**
 * @program: OracleStudy
 * @description: 父类通常情况下只定义了规范，具体的实现方式，要由子类重写方法
 * @author: FanYang
 * @create: 2021-07-27 09:25
 */
public class UserManager {
    static User[] users = new User[20];
    static int i = 0;
    Scanner scanner = new Scanner(System.in);

    /*
     * @Description: 添加客户信息
     * @Param: [user]
     * @return: void
     * @author: FanYang
     * @time: 2021/7/27 10:36
     */
    void add(User user) {
        users[i] = user;
        i++;
        System.out.println("成功添加第" + i + "个用户");
        System.out.println("真在打印添加新用户后的用户表");
        printTableInfo();
    }



    /*
     * @Description: 更改客户信息
     * @Param: [user]
     * @return: void
     * @author: FanYang
     * @time: 2021/7/27 10:29
     */
//    void update(User user) {
//        User one = getOne(user.getId());
//        if (null != one) {
//            one.setId((user.getId()));
//            one.setUserName(user.getUserName());
//            one.setBirthday(user.getBirthday());
//            one.setTypes(user.getTypes());
//            System.out.println(one.toString());
//        } else {
//            System.out.println("没有找到这个用户,请重新作出选择");
//        }
////        System.out.println("具体的更新操作");//这个方法不太成熟，有点bug，暂时没有解决
//    }

    void update(User user, int id) {
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

    /*
     * @Description: 删除指定用户
     * @Param: [id]
     * @return: void
     * @author: FanYang
     * @time: 2021/7/27 10:28
     */
    void delete(int id) {
        for (int j = id - 1; j < i - 1; j++) {
            users[j] = users[j + 1];
        }
        i--;
        System.out.println("真在打印删除后的用户表");
        printTableInfo();
    }

    /*
     * @Description: 查询指定用户
     * @Param: [id]
     * @return: com.fanyang.java.database.User
     * @author: FanYang
     * @time: 2021/7/27 10:28
     */
    User getOne(int id) {
        for (int j = 0; j < i; j++) {
            if (id == users[j].getId()) {
                System.out.println(users[j].toString());
                return users[j];
            }
        }
        System.out.println("没有这个用户,请重新作出选择");
        return null;
    }

    /*
     * @Description: 获取所有的用户信息
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/27 10:28
     */
    User[] getAllUser() {
        printTableInfo();
        return users;
    }

    /*
     * @Description: 通过此方法可以初始化更改用户信息
     * @Param: []
     * @return: com.fanyang.java.database.User
     * @author: FanYang
     * @time: 2021/7/27 14:54
     */
    public User inputInfo() {
        System.out.println("请输入用户ID");
        int id = scanner.nextInt();
        System.out.println("请输入用户名字");
        String name = scanner.next();
        System.out.println("请输入用户生日");
        String birthday = scanner.next();
//        System.out.println("请输入数据库类型");
//        String types = scanner.next();
        return new User(id, name, birthday);
    }

    /*
     * @Description: 用此方法循环遍历表中元素不为null的表信息
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/27 14:55
     */
    private void printTableInfo() {
        for (int k = 0; k < i; k++) {
            System.out.println(users[k].toString());
        }
    }
}
