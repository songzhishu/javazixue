package com.day25.UDP.组播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class 组播发送端 {
    public static void main(String[] args) throws IOException {

        //创建对象
        MulticastSocket ms=new MulticastSocket();

        //打包对象  返送的数据,IP端口
        String str="你好呀!臭狗屎";
        byte[] bytes = str.getBytes();
        int port=10086;
        InetAddress address= InetAddress.getByName("224.0.0.1");
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length,address,port);

        //发送

        ms.send(dp);
        //释放资源
        ms.close();
    }
}
