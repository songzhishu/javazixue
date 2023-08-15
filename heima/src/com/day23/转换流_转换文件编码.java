package com.day23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class 转换流_转换文件编码 {
    public static void main(String[] args) throws IOException {
        //高级流---包装基本流
        /*属于字符流   是字符流和字节流之间的桥梁*/

        //D:\a\b\c\d\e\f\h\g
        //按照指定编码----淘汰！
        /*InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\a\\b\\c\\d\\e\\f\\h\\g\\GBK.txt"),"gbk");

        //读取
        int ch;
        while((ch= isr.read())!=-1){
            System.out.print((char)ch);
        }
        //关闭
        isr.close();*/

        //指定编码读
        /*FileReader fr =new FileReader("D:\\a\\b\\c\\d\\e\\f\\h\\g\\GBK.txt", Charset.forName("GBK"));
        int ch;
        while((ch= fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();*/


        //指定编码写入 ----淘汰！
        /*OutputStreamWriter osw=new OutputStreamWriter( new FileOutputStream("e.txt"),"GBK");
        //写出数据
        osw.write("你好呀！臭狗屎！");
        osw.close();*/

        //指定编码写入
       /* FileWriter fw=new FileWriter("e.txt", Charset.forName("GBK"),true);
        fw.write("\r\n");
        fw.write("你才是臭狗屎呐！");
        fw.close();*/

        //将本地文件的GBK转换成utf-8
        //读
        /*FileReader fr=new FileReader("D:\\a\\b\\c\\d\\e\\f\\h\\g\\GBK.txt", Charset.forName("GBK"));
        FileWriter fw=new FileWriter("e.txt",Charset.forName("utf-8"),true);
        int ch;
        while ((ch= fr.read())!=-1){
            fw.write(ch);
        }
        fw.close();
        fr.close();*/


        //利用字节流读取文件的数据，每次读一行，并且不能是乱码
        /*//首先要有字节流叭
        FileInputStream fis = new FileInputStream("b.txt");
        //但是字节流只能读一个字节呀,读中文肯定会乱码呀,谁可以读中文并且不会乱码呀
        //字符流啊,怎么转化呐----转化流啊
        InputStreamReader isr = new InputStreamReader(fis);
        //现在可以读中文了,怎么能直接读一行呐,字符缓冲流啊*/
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("b.txt")));
        String len;
        while ((len = br.readLine()) != null) {

            System.out.println(len);
        }
        br.close();

    }

}
