package com.fanyang.java.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 10:58
 */
public class IoTest1 {
    @Test
    public void test1() {
        File file = new File("C:\\Users\\86187\\Desktop\\计算机生僻单词.txt");
        if (file.exists()) {
            System.out.println(file.getName());
            System.out.println("是否为文件 " + file.isFile());
            System.out.println("是否为文件夹 " + file.isDirectory());
            System.out.println("文件路径为" + file.toPath());
            System.out.println("文件是否可执行" + file.canExecute());
            System.out.println("文件是否可读" + file.canRead());
            System.out.println("文件是否可写" + file.canWrite());
            System.out.println(file);
        }
        File file1 = new File("C:\\Users\\86187\\Desktop\\计算机生僻单词1.txt");
        if (!file1.exists()) {
            try {
                System.out.println("创建成功");
                file1.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("出错了");
            }
        } else {
            file.delete();//
//            file1.deleteOnExit();//删除已经退出操作的文件
            System.out.println("删除成功");
        }
    }
}
