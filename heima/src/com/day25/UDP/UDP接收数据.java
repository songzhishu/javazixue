package com.day25.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDP接收数据 {
    public static void main(String[] args) throws IOException {
        //创建对象---接收的时候,一定要绑定端口并且绑定的端口要和发送端的端口保持一致
        DatagramSocket ds = new DatagramSocket(10086);


        //接受数据包
        //接收数组
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        System.out.println("1111111在等发送端发送数据!");
        ds.receive(dp);
        //不发就一直等
        System.out.println("OK接收到啦!");


        //解析数据包
        byte[] data= dp.getData();
        int length = dp.getLength();//接收的数据长度
        InetAddress address=dp.getAddress();//数据的发送ip
        String hostName = address.getHostName();//名字
        int port = dp.getPort();//数据的发送端口

        System.out.println("接收到的数据:"+new String(data,0,length));
        System.out.println("接收到的数据是从"+hostName+"这台电脑的"+port+"端口发出来的");

        //释放资源
        ds.close();



    }
}
