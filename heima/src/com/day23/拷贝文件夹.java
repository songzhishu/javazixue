package com.day23;

import java.io.*;

public class 拷贝文件夹 {
    public static void main(String[] args) throws IOException {
        //包含子文件夹


        //创建对象
        //源文件夹
        File sourceFile = new File("D:\\a\\b");
        //目标文件夹
        File targetFile = new File("D:\\a\\c");

        //调用方法
        copydir(sourceFile, targetFile);
    }

    private static void copydir(File sourceFile, File targetFile) throws IOException {
        targetFile.mkdirs();
        //递归
        //进入源文件夹
        File[] files = sourceFile.listFiles();
        for (File file : files) {
            //判断文件还是文件夹
            if (file.isFile()) {
                //是文件  ---字节流--数组快
                FileInputStream fis = new FileInputStream(file);
                //拷贝到哪里文件夹+文件名
                FileOutputStream fos = new FileOutputStream(new File(targetFile, file.getName()));
                byte[] bytes = new byte[1024 * 1024 * 5];
                int len;
                //如果读取的文件不末尾
                while ((len = fis.read(bytes)) != -1) {
                    //写入到目标文件
                    fos.write(bytes, 0, len);
                }
                //关闭流
                fos.close();
                fis.close();

            } else {
                //文奸夹
                copydir(file, new File(targetFile, file.getName()));

            }
        }
    }
}
