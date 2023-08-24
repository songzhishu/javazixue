package com.day25.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        //创建对象
        Socket socket=new Socket("127.0.0.1",10000);

        //从连接通道获取输出流
        OutputStream os=socket.getOutputStream();

        //写数据
        os.write("你好呀,臭狗屎!".getBytes());

        //释放资源
        os.close();
        socket.close();

    }
}
