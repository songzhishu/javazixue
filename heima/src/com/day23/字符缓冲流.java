package com.day23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class 字符缓冲流 {
    //纯文本文件哦!

    //特有方法   一次读一行
    public static void main(String[] args) throws IOException {
        //创键字符缓冲输入流的对象
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        //读取数据  读一行
        while ((br.readLine()) != null) {
            String s = br.readLine();
            System.out.println(s);
            //不会读取换行符
        }
        br.close();
    }
}
