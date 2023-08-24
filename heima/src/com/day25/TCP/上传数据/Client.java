package com.day25.TCP.上传数据;

import com.day09.使用StringBuilder拼接数组;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象俩连接服务器
        Socket  socket=new Socket("127.0.0.1",10000);
        //首先要读取本地文件

        //创建输入流读本地问价
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\JAVA\\我的项目\\javazixue\\heima\\src\\com\\day25\\TCP\\Cdir\\aa.jpg"));

        //输出流获取数据写入服务器
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        int len;
        byte[] bytes = new byte[1024];
        while((len= bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        //结束标记----往服务器写出结束标记
        socket.shutdownOutput();

        //接受服务器的回写数据
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);

        //释放资源
        socket.close();

    }
}
