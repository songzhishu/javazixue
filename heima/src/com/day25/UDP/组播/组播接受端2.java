package com.day25.UDP.组播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class 组播接受端2 {
    public static void main(String[] args) throws IOException {

        //创建对象
        MulticastSocket ms=new MulticastSocket(10086);

        //将本机添加到组播的的组中
        InetAddress address1 = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address1);

        //接受数据包
        //接收数组
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        System.out.println("1111111在等发送端发送数据!");
        ms.receive(dp);
        //不发就一直等
        System.out.println("OK接收到啦!");


        //解析数据包
        byte[] data= dp.getData();
        int length = dp.getLength();//接收的数据长度
        InetAddress address=dp.getAddress();//数据的发送ip
        String hostName = address.getHostName();//名字
        int port = dp.getPort();//数据的发送端口


        System.out.println("接收到的数据是从"+hostName+"这台电脑的"+port+"端口发出来的"+new String(data,0,length));

        //释放资源
        ms.close();
    }
}
