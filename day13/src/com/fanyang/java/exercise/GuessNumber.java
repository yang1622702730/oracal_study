package com.fanyang.java.exercise;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 11:17
 */
public class GuessNumber {
    private  Integer randomNumber;//生成的随机数
    private boolean flag = true;//作为循环结束的标志，true为继续循环，false跳出循环


    /*
     * @Description: 通过Random类的方法生成一个int型的随机数
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/3 11:32
    */
    private void creatRandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(101);//自动装箱
    }

    /*
     * @Description: 对玩家的输入数据进行判断，通过调用Integer类的重写的compareTo方法去比较用户输入数据的大小，如果随机数大则返回正数，
     * 小则返回负数，相同则结束循环
     * @Param: [guessNumber]
     * @return: void
     * @author: FanYang
     * @time: 2021/8/3 11:34
    */
    private void solutions(int guessNumber) {
//        System.out.println(randomNumber);
        int result = randomNumber.compareTo(guessNumber);
        if (result < 0) {
            System.out.println("猜大了！！！");
        } else if (result > 0) {
            System.out.println("猜小了！！！");
        } else {
            System.out.println("恭喜你猜对了！！！");
            flag = false;
        }
    }

    public void operateMethods() {
        Scanner scanner = new Scanner(System.in);
        creatRandomNumber();
        while (flag) {
            System.out.println("请猜数,数值均为整数");
            System.out.println("**********");
            int guess = scanner.nextInt();
            solutions(guess);
        }
    }

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.operateMethods();
    }
}
