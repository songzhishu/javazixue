package com.day24.同步方法;

public class test {
    public static void main(String[] args) {

        //要执行的程序
        ticket mr=new ticket();

        //创建线程对象
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);
        Thread t3=new Thread(mr);

        //设置名字
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();



    }
}
