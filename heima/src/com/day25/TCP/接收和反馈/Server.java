package com.day25.TCP.接收和反馈;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket ss=new ServerSocket(10000);
        //监听客户端的连接----有没有客户端来连接
        Socket socket = ss.accept();
        //从连接通道获取数据


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while((b= bufferedReader.read())!=-1){
            System.out.print((char) b);
        }

        //回写数据
        String str="你才是臭狗屎!";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());


        //释放资源
        bufferedReader.close();
        ss.close();

    }
}
