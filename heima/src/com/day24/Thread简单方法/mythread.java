package com.day24.Thread简单方法;

public class mythread extends Thread {
    public mythread() {
    }

    public mythread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+"@"+i);
        }
    }
}
