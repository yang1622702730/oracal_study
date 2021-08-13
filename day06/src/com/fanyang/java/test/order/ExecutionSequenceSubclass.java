package com.fanyang.java.test.order;/**
 * @author fanYang
 * @create 2021-07-26 11:17
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-26 11:17
 */
public class ExecutionSequenceSubclass extends ExecutionSequence{
    Test1 test1 = new Test1();

    public ExecutionSequenceSubclass() {//构造函数
        super();
        System.out.println("B的构造函数");
    }


    public static void main(String[] args) {
        ExecutionSequenceSubclass executionSequence = new ExecutionSequenceSubclass();
    }
}
