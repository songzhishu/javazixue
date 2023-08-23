package com.day23;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class 打印流_字符 {

    public static void main(String[] args) throws IOException {
    //底层有缓冲区,效率比较高,所以要想自动刷新要手动开启
        PrintWriter pw=new PrintWriter(new FileWriter("h.txt"),true);
        //写数据--不关流也可以直接写入
        pw.print(97);
        pw.println();
        pw.write(97);
        pw.printf("%s爱上了%S","阿珍","阿强");
        //pw.flush(); 手动刷新
    }
}
