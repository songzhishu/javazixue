package com.day25.UDP.聊天室;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP接收端 {
    public static void main(String[] args) throws IOException {
        //创建对象
        DatagramSocket ds=new DatagramSocket(10086);

        //接受数据包
        byte[] data = new byte[1024];
        DatagramPacket dp=new DatagramPacket(data, data.length);

        while (true) {
            //接收数据
            ds.receive(dp);

            //解析数据
            byte[] data1 = dp.getData();

            int port = dp.getPort();
            InetAddress address = dp.getAddress();
            System.out.println("接收到的数据是从"+address+"这台电脑的"+port+"端口发出来的"+new String(data1,0, dp.getLength()));
        }
    }
}
