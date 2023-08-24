package com.day25.TCP.上传数据_多线程_线程池;

import com.day25.TCP.上传数据_多线程.MR;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        
        //创建线程池对象
        ThreadPoolExecutor pool= new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()

        );
        
        //创建Serversocket对象绑定端口
        ServerSocket ss=new ServerSocket(10000);

        while (true) {
            //监听有没有客户端连接
            Socket socket = ss.accept();

            /*//只要有人连接就开启线程
            new Thread(new MR(socket)).start();*/
            pool.submit(new MR(socket));
        }
    }
}
