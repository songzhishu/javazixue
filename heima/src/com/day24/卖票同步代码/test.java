package com.day24.卖票同步代码;

public class test {
    public static void main(String[] args) {
        //创建线程对象
        ticket t1=new ticket();
        ticket t2=new ticket();
        ticket t3=new ticket();


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t2.start();
        t1.start();
        t3.start();
    }
}
