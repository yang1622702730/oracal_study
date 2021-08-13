package com.fanyang.java.io.exercise;

import org.junit.Test;

import java.io.File;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-13 10:27
 */
public class ReadSystemFile {
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

    /*
     * @Description: 文件夹的具体操作流程
     * @Param: [file]
     * @return: void
     * @author: FanYang
     * @time: 2021/8/13 11:03
     */
    private void operateDirectory(File file) {
        int countLength = 0;
        System.out.println(file + "它是目录");
        File[] newFiles = file.listFiles();
        if (newFiles != null) {//判断文件夹是否具有访问权限
            for (File newFile : newFiles) {
                countLength += newFile.length();//计算当前目录文件的文件大小
                if (newFile.isFile()) {
                    System.out.println();
                    System.out.println("它是" + file + "的子目录");
                    operateFile(newFile);//对目录下的文件进行相应操作
                }
            }
        } else {
            System.out.println("对" + file + "没有访问权限");
        }
        System.out.println(file + "目录的大小为" + countLength);
        judgeReadAndWriteAndExecute(file);


    }

    /*
     * @Description: 文件的具体操作流程
     * @Param: [file]
     * @return: void
     * @author: FanYang
     * @time: 2021/8/13 11:05
     */
    private void operateFile(File file) {
        System.out.println(file + "它是文件");
        System.out.println(file + "文件的大小为" + file.length());
        judgeReadAndWriteAndExecute(file);
    }


    /*
     * @Description: 判断文件的读写权限
     * @Param: [files]
     * @return: void
     * @author: FanYang
     * @time: 2021/8/13 11:06
     */
    private void judgeReadAndWriteAndExecute(File files) {
        boolean b = files.canExecute();
        if (b == true) {
            System.out.println("文件具有可执行权限");
        } else {
            System.out.println("文件不具备可执行权限");
        }
        boolean b1 = files.canRead();
        if (b1 == true) {
            System.out.println("文件具有可读权限");
        } else {
            System.out.println("文件不具备可读权限");
        }
        boolean b2 = files.canWrite();
        if (b2 == true) {
            System.out.println("文件具有可写权限");
        } else {
            System.out.println("文件不具备可写权限");
        }
    }

}
