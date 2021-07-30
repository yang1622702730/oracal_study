package com.fanyang.java.test.agencymodel;/**
 * @author fanYang
 * @create 2021-07-28 14:35
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-28 14:35
 */
public class ProxyServer implements Network {
    private Network network;
    public ProxyServer(Network network){
        this.network = network;
    }
    public void check(){
        System.out.println("联网之前的安全检查");
    }
    @Override
    public void browse() {
        check();
        network.browse();
    }
}
