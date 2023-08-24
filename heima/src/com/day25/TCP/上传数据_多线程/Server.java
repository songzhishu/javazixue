package com.day25.TCP.上传数据_多线程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建Serversocket对象绑定端口
        ServerSocket ss=new ServerSocket(10000);

        while (true) {
            //监听有没有客户端连接
            Socket socket = ss.accept();

            //只要有人连接就开启线程
            new Thread(new MR(socket)).start();
        }
    }
}
