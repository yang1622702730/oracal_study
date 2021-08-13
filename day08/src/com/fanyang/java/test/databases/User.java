package com.fanyang.java.test.databases;


/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-27 09:25
 */
public class User {
    private int id;
    private String userName;
    private String birthday;
    private String types;

    public User() {
    }

    public User(int id, String userName, String birthday) {
        this.id = id;
        this.userName = userName;
        this.birthday = birthday;
    }

    public User(int id, String userName, String birthday, String types) {
        this.id = id;
        this.userName = userName;
        this.birthday = birthday;
        this.types = types;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", types='" + types + '\'' +
                '}';
    }
}
