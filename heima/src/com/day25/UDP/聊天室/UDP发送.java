package com.day25.UDP.聊天室;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDP发送 {
    public static void main(String[] args) throws IOException {
        //创建对象
        DatagramSocket ds=new DatagramSocket();//没有指定,随机端口

        //打包数据
        Scanner sr=new Scanner(System.in);
        while (true) {
            System.out.println("输入你要说的话:");
            String s = sr.nextLine();

            if("886".equals(s)){
                break;
            }
            //将输入的数据转成字符数组
            byte[] bytes = s.getBytes();
            //定义发送信息的ip
            InetAddress byName = InetAddress.getByName("127.0.0.1");

            //指定发送的端口
            int port=10086;
            DatagramPacket dp=new DatagramPacket(bytes, bytes.length,byName,port);
            //发送数据
            ds.send(dp);
        }

        //释放资源
        ds.close();
    }
}
