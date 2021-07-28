package com.fanyang.java.agencymodel;/**
 * @author fanYang
 * @create 2021-07-28 14:34
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 14:34
 */
public class Server implements Network{

    @Override
    public void browse() {
        System.out.println("真实的网络访问");
    }
}
