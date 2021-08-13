package com.company;

import org.junit.Test;

/**
 * @program: day03
 * @description:打印9*9乘法表
 * @author: FanYang
 * @create: 2021-07-21 15:26
 */
public class MultiplicationTable {
    public void prints(){
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+" = "+i*j+"  ");
            }
            System.out.println("\n");
        }
    }
    @Test
    public void testPrints(){
        prints();
    }
}
