package com.fanyang.java.test.database;

/**
 * @program: OracleStudy
 * @description: 子类去重写，实现父类中的方法
 * @author: FanYang
 * @create: 2021-07-27 09:32
 */
public class UserManagerForMysql extends UserManager{
/*    @Override
    void add(User user) {
        user.setTypes("MYSQL");
        super.add(user);
        System.out.println("Mysql添加用户");
        System.out.println(user.toString());
    }*/

    @Override
    void add(User user) {
        user.setTypes("MYSQL");
        super.add(user);
    }

    @Override
    void update(User user, int id) {
//        user.setTypes("MYSQL");
        super.update(user, id);
    }

    @Override
    void delete(int id) {
        super.delete(id);
    }

    @Override
    User getOne(int id) {
        return super.getOne(id);
    }

    @Override
    User[] getAllUser() {
        return super.getAllUser();
    }

    @Override
    public User inputInfo() {
        return super.inputInfo();
    }
}
