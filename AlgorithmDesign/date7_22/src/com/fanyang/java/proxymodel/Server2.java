package com.fanyang.java.proxymodel;

/**
 * @program: testcode
 * @description:
 * @author: FanYang
 * @create: 2021-07-21 18:57
 */
public class Server2 implements Network {
    @Override
    public void browse() {
        System.out.println("Server2正在进行联网");
    }
}
