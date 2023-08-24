package com.day25.TCP.上传数据_多线程_线程池;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MR implements Runnable{
    Socket socket;

    public MR(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //读取数据
            BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
            //生成随机名字
            String replace = UUID.randomUUID().toString().replace("-", "");
            //写到本地
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\JAVA\\我的项目\\javazixue\\heima\\src\\com\\day25\\TCP\\Sdir\\"+replace+".jpg"));

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


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(socket!=null){
                //释放资源
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
