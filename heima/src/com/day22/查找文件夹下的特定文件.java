package com.day22;

import java.io.File;

public class 查找文件夹下的特定文件 {
    public static void main(String[] args) {
        //递归
        //查找一个盘符的某一格式的文件

        /*套路
         * 1进入文件夹
         * 2遍历数组
         * 3判断
         * 4判断*/

        File src = new File("C:\\");

        findavi(src);
    }

    public static void findavi(File file) {
        //进入文件夹
        File[] files = file.listFiles();
        if (files != null) {
            //遍历文件或者文件夹
            for (File file1 : files) {
                //判断是文件还是文件夹
                if (file1.isFile() && file1.getName().endsWith(".MP4")) {
                    System.out.println(file1);
                } else if (!file1.isFile()) {
                    //递归
                    findavi(file1);
                }
                {

                }
            }
        }


    }
}
