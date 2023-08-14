package com.day23;

import java.io.FileInputStream;
import java.io.IOException;

public class 字节输入流读取本地文件 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis = new FileInputStream("a.txt");
        /*//读取数据
        int b1=fis.read();
        System.out.println(b1);*/

        /*文件不存在 就会报错,因为要去读取数据,找不到就报错!!
         *
         * 一次读取一个字节, 读出来的是数据对应Ascii码表上的对应的数据
         * 读到文件的末尾read方法会返回一个-1
         * */


        //循环读取

        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        //释放资源
        fis.close();


    }
}
