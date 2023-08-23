package com.day24.Callable_Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class 多线程_有返回值 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //可以获取多线程的运行结果

        //创建自定义类实现Callable接口
        //重写call(有返回值,表示多线程运行的结果)
        //创建自定义类的对象(表示多线程要执行的任务)
        //创建FutrueTask的对象（管理多线程运行的结果）
        //创建线程Thread的对象，并启动（表示线程）
        mycallable mc=new mycallable();

        FutureTask<Integer> ft=new FutureTask<>(mc);
        //表示用FutureTask去管理mc运行的结果


        //创建线程对象
        Thread t1=new Thread(ft);
        //开启线程
        t1.start();
        //获取运行结果
        Integer integer = ft.get();

        System.out.println(integer);

    }
}
