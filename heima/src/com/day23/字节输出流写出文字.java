package com.day23;

import java.io.FileOutputStream;
import java.io.IOException;

public class 字节输出流写出文字 {
    public static void main(String[] args) throws IOException {
        //暂时不可以写入中文

        /*参数是字符串表示的路径或者是File对象都可以
        如果文件不存在那么会创建一个新的文件,但是要保证父级路径要存在!
        如果文件已存在,则会清空原来文件的内容

        * */
        //创建对象   有两个参数,一个是文件的路径和名字,一个是否支持续写
        FileOutputStream fos = new FileOutputStream("a.txt", true);

        //写入数据   里面的参数是整数,但是真实写入的是整数在Ascii上对应的字符
        //
        // fos.write(97);

        //数据写入的三种方式
        /*一次写一个  write()
         * 一次写多个  write(byte [])*/
        /*byte [] arr={79,56,99,102,5,68};
        fos.write(arr);*/

        /*//一次写多个可指定  write(byte [],int off,int len)------从off开始写入,写入len的数据
        byte [] arr={79,56,99,102,5,68,97,98,99,10,100,101,102,103,104};
        fos.write(arr,5,4);
        //释放资源     防止资源一直被占用
        fos.close();*/


        //换行写入
        String str = "abcdefghijklmnopqrxyz";
        byte[] bytes = str.getBytes();
        /*System.out.println(Arrays.toString(bytes));*/
        fos.write(bytes);

        //写入一个换行符
        String str2 = "\r\n";
        byte[] bytes2 = str2.getBytes();

        fos.write(bytes2);

        String str1 = "666";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);
        fos.close();


    }
}
