package com.day24.插入_插队线程;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
            Thread.yield();
            //表示出让当前CPU的执行权,当前线程执行完以后让出,然后重新抢占CPU的资源,
            // 只是可能改善让他们可以分配CPU资源的能力,尽可能让他们分配均匀,但是还是有一定的随机性
        }
    }
}
