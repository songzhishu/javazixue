package com.day25.TCP.多发多收;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //多发
        //创建Socket对象并且连接服务器
        Socket socket=new Socket("127.0.0.1",10000);

        //写数据--键盘录入
        Scanner sr=new Scanner(System.in);
        OutputStream outputStream = socket.getOutputStream();
        //输出流
        while (true) {
            System.out.println("输入你要传输的数据:");
            String str = sr.nextLine();
            if ("886".equals(str)){
                break;
            }
            //写入
            outputStream.write(str.getBytes());

        }

        //释放资源
        socket.close();

    }
}
