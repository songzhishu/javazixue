package com.day23;

import java.io.FileReader;
import java.io.IOException;

public class 字符流输入流 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileReader fr = new FileReader("a.txt");

        /*//读取数据 一个一个   只是读取 和解码
        read()空参时候一次读一个数据,遇到中文会一次读取多个,
         * 并且把这些二进制的转换成十进制,返回

        int ch;
        while((ch= fr.read())!=-1){
            System.out.print((char) ch);
        }*/

        //一次多个数据 读取数据  这个牛逼  读取 解码 强转合一
        int ch;
        char[] str = new char[4];
        while ((ch = fr.read(str)) != -1) {
            System.out.println(new String(str, 0, ch));
        }

        //关闭资源
        fr.close();
    }
}
