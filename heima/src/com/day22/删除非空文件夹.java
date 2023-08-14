package com.day22;

import java.io.File;

public class 删除非空文件夹 {
    public static void main(String[] args) {
        //递归
        //

        /*套路
         * 1进入文件夹
         * 2遍历数组
         * 3判断
         * 4判断*/

        File src = new File("D:\\完美");

        deletek(src);
    }

    public static void deletek(File file) {
        //先删除文件夹的内容
        File[] files = file.listFiles();
        //遍历
        for (File file1 : files) {
            if (file1.isFile()) {
                file1.delete();
            } else {
                deletek(file1);
            }
        }


        //删自己
        file.delete();


    }
}
