package com.company.test;

/**
 * @program: testcode
 * @description: 单例模式的编写
 * @author: FanYang
 * @create: 2021-07-21 10:25
 */
public class SingletonMode {
 /*   //饿汉式
    private SingletonMode(){}
    private static SingletonMode singletonMode = new SingletonMode();
    public static SingletonMode getSingletonMode(){
        return singletonMode;
    ｝*/

    //懒汉式
    private SingletonMode() {
    }

    private static SingletonMode singletonMode = null;

    public static SingletonMode getInstance() {
        if (singletonMode == null) {
            singletonMode = new SingletonMode();
        }
        return singletonMode;
    }
}
