package com.day24.等待唤醒机制消费者生产者;

public class test {
    public static void main(String[] args) {
        //创建线程对象
        Cook cook = new Cook();
        Consumer consumer = new Consumer();

        //设置名字
        cook.setName("厨师");
        consumer.setName("消费者");

        //开启线程
        cook.start();
        consumer.start();
    }
}
