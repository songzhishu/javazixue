package com.day25.TCP.接收和反馈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端发,服务器接收后给客户端发消息,客户端打印
        //服务器收,给客户端一个反馈
        //创建对象
        Socket socket=new Socket("127.0.0.1",10000);

        //从连接通道获取输出流
        OutputStream os=socket.getOutputStream();

        //写数据
        os.write("你好呀,臭狗屎!".getBytes());

        //结束标记
        socket.shutdownOutput();

        //接受回写的数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("来自服务器的反馈");
        int b;
        while((b= bufferedReader.read())!=-1){
            System.out.print((char) b);
        }
        //释放资源
        os.close();
        socket.close();


    }
}
