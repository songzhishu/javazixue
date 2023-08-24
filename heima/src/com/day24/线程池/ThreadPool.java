package com.day24.线程池;

import java.util.concurrent.Callable;

public class ThreadPool implements Runnable {
    @Override
    public void run() {

            System.out.println(Thread.currentThread().getName()+"----");

    }
}
