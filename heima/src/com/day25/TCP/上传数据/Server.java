package com.day25.TCP.上传数据;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建Serversocket对象绑定端口
        ServerSocket ss=new ServerSocket(10000);

        //监听有没有客户端连接
        Socket socket = ss.accept();

        //读取数据
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        //生成随机名字
        String replace = UUID.randomUUID().toString().replace("-", "");
        //写到本地
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\JAVA\\我的项目\\javazixue\\heima\\src\\com\\day25\\TCP\\Sdir"+replace+".jpg"));

        byte[] bytes = new byte[1024];
        int len;
        while((len= bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        //回写数据
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("我收到了!");
        bw.newLine();
        bw.flush();

        //释放资源
        socket.close();
        ss.close();
    }
}
