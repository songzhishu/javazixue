package com.day23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class 打印流_字节 {
    public static void main(String[] args) throws FileNotFoundException {
        //创建对象关联本地问价
        PrintStream ps =new PrintStream(new FileOutputStream("g.txt",true),true, Charset.forName("GBK"));
        ps.write(97);
        ps.println(97);//原样写入自动换行,自动刷新
        ps.print(97);//不换行
        ps.println();
        ps.printf("%s爱上了%S","阿珍","阿强");//不区分大小写居然
        ps.close();
    }
}
