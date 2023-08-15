package com.day23;


import java.io.*;

public class 字节缓冲流拷贝文件 {
    public static void main(String[] args) throws IOException {
        //一次读一个对象  读
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a\\b\\c\\a.txt"));
        //写
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\a\\b\\c\\d\\e\\f\\g\\copy1.txt"));

        int a;
        while ((a = bis.read()) != -1) {
            bos.write(a);
        }

        //关流
        bos.close();
        bis.close();

        //很快很快!
    }
}
