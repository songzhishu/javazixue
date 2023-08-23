package com.day24.Runnable;

public class 多线程_Runnable {
    public static void main(String[] args) {
        //定义一个类去实现Runnable接口
        //重写run方法
        //创建自己类的对象
        //创建Thread类的对象,并开启线程


        //创建myrun对象--表示要执行的任务
        myrun mr=new myrun();

        //创建线程对象
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);

        //开启线程
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();

    }
}
