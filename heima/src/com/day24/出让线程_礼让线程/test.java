package com.day24.出让线程_礼让线程;

public class test {
    public static void main(String[] args) {
        //创建对象
        MyThread mt=new MyThread();
        MyThread mt1=new MyThread();
        mt.setName("飞机");
        mt1.setName("坦克");

        mt.start();
        mt1.start();
    }
}
