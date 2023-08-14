package com.day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 文件拷贝 {
    public static void main(String[] args) throws IOException {
        //一次读取一个字节----慢
        /*//原路径 ----读到的
        FileInputStream fis=new FileInputStream("D:\\a\\b\\抖音.mp4");
        //复制的路径-----写入
        FileOutputStream fos =new FileOutputStream("D:\\a\\b\\copy.mp4");
        //拷贝---边读边写
        int b;
        long start = System.currentTimeMillis();
        while ((b= fis.read())!=-1){
            fos.write(b);
        }
        long end = System.currentTimeMillis();
        //释放资源 ---先开的后关
        fos.close();
        fis.close();
        System.out.println("时间:" + (start - end));*/

        /*//一次读取一个数组
        //创建对象
        FileInputStream fis=new FileInputStream("a.txt");
        //读取数据------一次读取一个数组的长度,返回值是本次读取的多少字节的数据
        while (true) {
            byte[] bytes=new byte[3];
            int read = fis.read(bytes);
            if (read==-1){
                break;
            }
            System.out.println(read);
            String s = new String(bytes,0,read);
            System.out.println(s);
        }*/

        //快速拷贝
        //原路径 ----读到的
        FileInputStream fis = new FileInputStream("D:\\a\\b\\CSGO.mp4");
        //复制的路径-----写入
        FileOutputStream fos = new FileOutputStream("D:\\a\\c\\copy.mp4");

        //拷贝
        int len;
        //定义读取数据的数组长度
        byte[] bytes = new byte[1024 * 1024 * 5];
        long start = System.currentTimeMillis();
        while ((len = fis.read(bytes)) != -1) {
            //上面读多少 下面写多少!
            fos.write(bytes, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println("时间:" + (end - start));

        //关闭资源
        fos.close();
        fis.close();

        //字节流 可以拷贝任意类型的文件
        //字符流 读取纯文本文件中的数据,往纯文本中写入数据
    }
}
