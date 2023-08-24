package com.day25.UDP;

import com.day09.使用StringBuilder拼接数组;

import java.io.IOException;
import java.net.*;

public class UDP发送数据 {
    public static void main(String[] args) throws IOException {
        //创建对象--有参是指定端口号 空参不指定端口号
        DatagramSocket ds=new DatagramSocket();
        //打包对象  返送的数据,IP端口
        String str="你好呀!臭狗屎";
        byte[] bytes = str.getBytes();
        int port=10086;
        InetAddress address= InetAddress.getByName("127.0.0.1");
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length,address,port);

        //发送

        ds.send(dp);
        //释放资源
        ds.close();


    }
}
