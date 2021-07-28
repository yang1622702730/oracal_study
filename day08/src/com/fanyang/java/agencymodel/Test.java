package com.fanyang.java.agencymodel;/**
 * @author fanYang
 * @create 2021-07-28 14:37
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 14:37
 */
public class Test {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}
