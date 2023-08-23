package com.day24.Thread;

public class 多线程_Thread {
    //定义一个类继承Thrad
    //重写run方法
    //创建子类对象,启动线程
    public static void main(String[] args) {
        mythrad mt1=new mythrad();
        mythrad mt2=new mythrad();
        mt1.setName("线程1");
        mt2.setName("线程2");
        mt1.start();
        mt2.start();
    }
}
