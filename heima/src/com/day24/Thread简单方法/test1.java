package com.day24.Thread简单方法;

public class test1 {
    public static void main(String[] args) throws InterruptedException {

        /*空参即使我们没有设置名字,线程默认也有名字Thread-一个数字默认从零开始
        * 1、有参(设置名字)
        * 2、可以用set方法或者构造方法来*/

        /*//创建类对象--空参
        mythread mt1 = new mythread();
        mythread mt2 = new mythread();*/


        /*//创建类对象--设置名字(有参)
        mythread mt1 = new mythread("大炮");
        mythread mt2 = new mythread("烧火棍");*/

        /*//开启线程
        mt1.start();
        mt2.start();*/

        /*Thread thread = Thread.currentThread();//获取当前的线程
        System.out.println(thread.getName());//mian*/
        //当jvm启动之后，会自动启动多个线程--其中就有main线程，它的作用就是调用main方法执行里面的代码


        /*//让线程休眠---谁执行谁休眠
        System.out.println("11111");
        Thread.sleep(5000);
        System.out.println("11111");
        //停了5秒钟*/

        mythread mt1 = new mythread("大炮");
        mythread mt2 = new mythread("烧火棍");

        mt1.start();
        mt2.start();
    }
}
