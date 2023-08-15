package com.day23;

import java.io.*;

public class 字节缓冲流拷贝_多字节 {
    public static void main(String[] args) throws IOException {
        //多字节读取
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a\\b\\c\\d\\e\\f\\g\\单排.MP4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\a\\b\\c\\d\\e\\f\\h\\g\\单排.MP4"));

        //定义拷贝字节数组长度
        byte[] bytes = new byte[1024 * 1024 * 5];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            //写入
            bos.write(bytes, 0, len);
        }

        //关流
        bos.close();
        bis.close();

        //实质上还是基本流去本地文件读取数据然后交给缓冲输入流,然后存入到缓冲区,要注意的是,字节缓冲输入流和字节缓冲输出流都有缓冲区
        /*数据源------>基本流---->缓冲输入流----缓冲输入字节流的缓冲区-----缓冲输出字节流的缓冲区--缓冲输出流---基本流----目的地*/
    }
}
