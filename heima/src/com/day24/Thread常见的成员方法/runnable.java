package com.day24.Thread常见的成员方法;

public class runnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println(Thread.currentThread().getName()+"---"+i);

        }

    }
}
