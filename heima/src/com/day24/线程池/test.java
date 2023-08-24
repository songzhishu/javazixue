package com.day24.线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        //创建线程池对象---没上限
        ExecutorService pool= Executors.newCachedThreadPool();
        //创建线程池对象---有上限
        ExecutorService pool1= Executors.newFixedThreadPool(3);

        //提交任务
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());

        //销毁线程池
        //pool.shutdown();
    }
}
