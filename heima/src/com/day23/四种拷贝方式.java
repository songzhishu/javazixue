package com.day23;

import java.io.*;

public class 四种拷贝方式 {
    public static void main(String[] args) throws IOException {

        //第一种字节流 一个一个字节
        //源数据
        FileInputStream fis1 = new FileInputStream("D:\\a\\b\\c\\钢铁侠.MP4");
        //目的地
        FileOutputStream fos1 = new FileOutputStream("D:\\a\\b\\c\\钢铁侠copy1.MP4");

        int a;
        long copy1start = System.currentTimeMillis();
        while ((a = fis1.read()) != -1) {
            fos1.write(a);
        }
        fos1.close();
        fis1.close();
        long copy1end = System.currentTimeMillis();
        System.out.println("字节流 一个一个字节:" + (copy1end - copy1start) + "ms");


        //字节流 一个多个字节
        //源数据
        FileInputStream fis2 = new FileInputStream("D:\\a\\b\\c\\钢铁侠.MP4");
        //目的地
        FileOutputStream fos2 = new FileOutputStream("D:\\a\\b\\c\\钢铁侠copy2.MP4");

        int b;
        byte[] bytes = new byte[1024];
        long copy2start = System.currentTimeMillis();
        while ((b = fis2.read(bytes)) != -1) {
            fos2.write(bytes, 0, b);
        }
        fos2.close();
        fis2.close();
        long copy2end = System.currentTimeMillis();
        System.out.println("字节流 多个字节:" + (copy2end - copy2start) + "ms");


        //字节缓冲流  一次一个字节
        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("D:\\a\\b\\c\\钢铁侠.MP4"));
        BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("D:\\a\\b\\c\\钢铁侠copy3.MP4"));

        int c;
        long copy3start = System.currentTimeMillis();
        while ((c = bis1.read()) != -1) {
            bos1.write(c);
        }
        bos1.close();
        bis1.close();
        long copy3end = System.currentTimeMillis();
        System.out.println("字节缓冲流 一个字节:" + (copy3end - copy3start) + "ms");


        //字节缓冲流  一次多个字节
        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("D:\\a\\b\\c\\钢铁侠.MP4"));
        BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("D:\\a\\b\\c\\钢铁侠copy4.MP4"));

        int d;
        byte[] bytes1 = new byte[1024];
        long copy4start = System.currentTimeMillis();
        while ((d = bis2.read(bytes1)) != -1) {
            bos2.write(bytes1, 0, d);
        }
        bos2.close();
        bis2.close();
        long copy4end = System.currentTimeMillis();
        System.out.println("字节缓冲流 多个字节:" + (copy4end - copy4start) + "ms");


    }


}
