package com.fanyang.java.random;

import org.junit.Test;

import java.util.Random;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 09:54
 */
public class RandomTest1 {
    @Test
    public void test1() {
        Random random = new Random();
        System.out.println(random.nextInt(101));//取整为[1,101)范围内的整数，java的左闭右开原则
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextFloat());
        System.out.println(random.nextLong());
    }

    @Test
    public void test2(){
        Random r1=new Random(45);//Random使用一个48位的种子，如果两个Random类的实例是同一个种子创建的额，对它们以同样的顺序调用，将会参数同样的随机数
        Random r2=new Random(45);
        System.out.println(r1.nextFloat()+";"+r2.nextFloat());
        System.out.println(r1.nextInt()+";"+r2.nextInt());
        System.out.println(r1.nextLong()+";"+r2.nextLong());
        System.out.println(r1.nextBoolean()+";"+r2.nextBoolean());
        System.out.println(r1.nextBoolean()+";"+r2.nextInt());//调用顺序不同，因而r2的随机数与上面生成的随机数不一样
    }
    /*结果解析：如果连个Random对象的种子相同，而且方法的调用顺序也相同，则它们会产生同样的数字序列，也就是说，Random产生的不是
    真正的随机数，而是伪随机数。为了避免两个Random对象产生同样的数字序列，*/
}
