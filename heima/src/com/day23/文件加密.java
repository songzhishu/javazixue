package com.day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 文件加密 {
    public static void main(String[] args) throws IOException {
        /*异或^
         * 同假异真
         * */
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ true);
        /*如果异或的两边是数值时------将数值变成为二进制,一个数字与另一个数字异或两次会得到原数字*/

        //字节流什么都可已处理--牛死了
        //字符流 纯文本文件

        //创建对象关联原始文件 ----读
        FileInputStream fis = new FileInputStream("D:\\a\\b\\c\\d\\e\\f\\g\\抖音.mp4");
        //创建对象关联加密文件 ----写
        FileOutputStream fos = new FileOutputStream("D:\\a\\b\\c\\d\\e\\f\\g\\加密.jpg");

        //加密处理
        int a;
        while ((a = fis.read()) != -1) {
            fos.write(a ^ 10);
        }
        //释放资源
        fos.close();
        fis.close();

    }
}
