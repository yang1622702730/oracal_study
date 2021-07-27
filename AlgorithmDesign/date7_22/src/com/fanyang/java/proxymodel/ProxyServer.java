package com.fanyang.java.proxymodel;

/**
 * @program: testcode
 * @description:
 * @author: FanYang
 * @create: 2021-07-21 18:58
 */
public class ProxyServer implements Network {
    private Network network;
    public ProxyServer(Network network){
        this.network = network;
    }
    private void check(){
        System.out.println("正在进行联网前的检查");
    }
    @Override
    public void browse() {
        check();
        network.browse();
    }
    public static void main(String[] args) {
        ProxyServer proxyServer1 = new ProxyServer(new Server1());
        proxyServer1.browse();
        ProxyServer proxyServer2 = new ProxyServer(new Server2());
        proxyServer2.browse();
    }
}
