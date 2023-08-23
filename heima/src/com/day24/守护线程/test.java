package com.day24.守护线程;

public class test {
    public static void main(String[] args) {
        /*守护线程
        * 当非守护的线程执行完毕后,守护线程也会陆续结束
        * 比如qq聊天,一边聊天一边转文件
        * 当我关闭聊天窗口的时候传输文件也会结束,聊天就是非守护线程,而传输文件就是守护线程*/


        //创建对象
        MyThread1 mt1=new MyThread1();
        MyThread1 mt2=new MyThread1();

        mt1.setName("女神");
        mt2.setName("备胎");

        //将备胎设置为守护线程
        mt2.setDaemon(true);

        //执行
        mt2.start();
        mt1.start();

    }
}
