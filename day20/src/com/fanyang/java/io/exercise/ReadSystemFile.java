package com.fanyang.java.io.exercise;

import org.junit.Test;

import java.io.File;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-13 10:27
 */
public class Exercise1 {
    @Test
    public void judgeDirectoryOrFile() {
        File file = new File("C:\\Program Files");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                operateDirectory(file1);
                System.out.println();
            } else {
                operateFile(file1);
                System.out.println();
            }
        }
    }

    private void operateDirectory(File file) {
        int countLength = 0;
        System.out.println(file+"它是目录");
        File[] newFiles = file.listFiles();
        if (newFiles != null) {
            for (File newFile : newFiles) {
                countLength += newFile.length();//计算当前目录文件的文件大小
                if (newFile.isFile()){
                    System.out.println();
                    System.out.println("它是"+file+"的子目录");
                    operateFile(newFile);
                }
            }
        }System.out.println(file + "目录的大小为" + countLength);
        judgeReadAndWriteAndExecute(file);





    }

    private void operateFile(File file) {
        System.out.println(file+"它是文件");
        System.out.println(file + "文件的大小为" + file.length());
        judgeReadAndWriteAndExecute(file);
    }

    private void judgeReadAndWriteAndExecute(File files) {
        boolean b = files.canExecute();
        if (b == true) {
            System.out.println("文件具有可执行权限");
        }
        boolean b1 = files.canRead();
        if (b1 == true) {
            System.out.println("文件具有可读权限");
        }
        boolean b2 = files.canWrite();
        if (b2 == true) {
            System.out.println("文件具有可写权限");
        }
    }

}
