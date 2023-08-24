package com.day24.自定义线程池;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        /*7个参数
        * 核心线程数量---不能小于0
        * 最大线程--不能小于0 最大数量>核心线程数量
        * 空闲线程最大存活时间 ---不能小于零
        * 时间单位   -----用TimeUnit指定
        * 队伍队列   不能为空null
        * 创建线程工厂  不能为null
        * 任务的拒绝策略  不能为null
        * */

        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3,
                6,
                1,
                TimeUnit.MINUTES,//分钟
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

    }
}
