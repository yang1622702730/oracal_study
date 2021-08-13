package com.company;

import org.junit.Test;

import java.util.Scanner;

/**
 * @program: day03
 * @description: 输入数据，根据提示猜数
 * @author: FanYang
 * @create: 2021-07-21 16:01
 */
public class GuessNumber {
    public void guessNumber() {
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            count++;
            System.out.println("请输入你猜测的数字");
            int guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("猜大了");
                continue;
            } else if (guess < randomNumber) {
                System.out.println("猜小了");
                continue;
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
        System.out.println("你总共猜了"+count+"次");
    }

//    @Test
//    public void test() {
//        guessNumber();
//    }   //用test去测试代码无法手动输入数据
public static void main(String[] args) {
    GuessNumber guessNumber = new GuessNumber();
    guessNumber.guessNumber();
}

}
