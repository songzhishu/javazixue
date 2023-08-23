package com.day24.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class tset {
    public static void main(String[] args) {
        //创建阻塞队列
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        //创建线程对象
        Cook cook = new Cook(queue);
        Consumer consumer = new Consumer(queue);


        cook.setName("厨师");
        consumer.setName("消费者");
        //开启线程
        cook.start();
        consumer.start();

    }
}
