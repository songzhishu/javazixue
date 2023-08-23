package com.day24.买票;

public class test {
    public static void main(String[] args) {
        //创建线程对象
        ticket t1=new ticket("窗口1");
        ticket t2=new ticket("窗口2");

        //开启线程
        t1.start();
        t2.start();
    }
}
