package com.day23;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class 字符输出流 {
    public static void main(String[] args) throws IOException {
        //字节流输出流
        FileOutputStream fos = new FileOutputStream("a.txt", true);
        fos.write(97);
        fos.close();

        //字符输出流

        FileWriter fw = new FileWriter("a.txt", true);
        //一次输入一个字符 参数是整数 然后将整数对应utf-8里面的编码找到对应的文字
        fw.write(25105);

        //一次写入一个字符串
        //换行
        fw.write("\r");
        fw.write("好喜欢你");

        //一次写入一个字符串的一部分
        fw.write("\r");
        fw.write("晚安的时候怎么忘了抱你", 9, 2);

        //一次写入一个字符数组
        char[] arr = {'你', '你', '你', '你', '你', '你', '你', '你', '你'};
        fw.write(arr, 0, 5);

        /*字符流 在读取本地文件的时候会,预先将文件里的内容读取到文件的缓冲区
         * 缓冲区长度为8192个字节数组,如果本地文件有内容会预先将本地文件的内容
         * 读取到缓冲区,然后再缓冲区上面读取数据,这样的好处就是可以减少频繁的
         * 访问本地文件,提高效率,每次填充缓冲区的时候尽可能装满,如果文件里没有
         * 数据了就返回-1
         * 字节流可没有这种功能哦1*/

        /*字节流写入文件也是先写入缓冲区,那么怎么从缓冲区去写入本地文件呐
         * 1当缓冲区满了
         * 2手动刷新调用flush
         * 3释放资源也就是关流
         * 2和3是有一定区别的,2执行过后还可以再写文件,因通道还在,但是关闭资源就不可以了
         * */

        fw.close();
    }
}
