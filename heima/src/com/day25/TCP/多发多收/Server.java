package com.day25.TCP.多发多收;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建对象
        ServerSocket ss=new ServerSocket(10000);
        //监听客户端的连接----有没有客户端来连接
        Socket socket = ss.accept();

        //从连接通道获取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int a;
        while ((a=br.read())!=-1){
            System.out.print((char) a);
        }


        //管资源
        ss.close();
    }
}
