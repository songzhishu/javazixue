package com.day24.Runnable;

public class myrun implements Runnable{
    @Override
    public void run() {
        //线程执行的代码
        for (int i = 0; i < 100; i++) {

            //获取当前线程的对象
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+"你是狗!");
        }
    }
}
