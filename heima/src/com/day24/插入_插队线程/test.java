package com.day24.插入_插队线程;


public class test {
    public static void main(String[] args) throws InterruptedException {
        //创建对象
        MyThread mt = new MyThread();
        mt.setName("土豆");
        mt.start();

        //将土豆插入当前线程,也就是说,土豆这个线程运行在哪个线程上面插入谁
        mt.join();


        //执行在main线程中
        for (int i = 0; i < 10; i++) {
            System.out.println("mian"+i);
        }
    }
}
