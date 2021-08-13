package com.fanyang.java.exercise;

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-27 09:35
 */
public class OperateUser {
    private final String DEFAULT = "MYSQL";

    public UserManager setUserManager(String types) {
        if (types == null) {
            return new UserManagerForMysql();
        }
        if (types.equalsIgnoreCase("ORAClE")) {
            return new UserManagerForOracle();
        }
        if (types.equalsIgnoreCase("MYSQL")) {
            return new UserManagerForMysql();
        }
        return null;
    }

    public UserManager setUserManager() {
        return setUserManager(null);
    }
}
