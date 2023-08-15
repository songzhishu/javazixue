package com.day23;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class 字符缓冲输出流 {
    public static void main(String[] args) throws IOException {
        //跨平台的换行

        //创键写入对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("e.txt", true));
        bw.write("你好呀!");
        bw.newLine();
        bw.write("臭狗屎!");
        bw.close();

    }
}
