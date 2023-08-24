package com.day24.线程栈_有返回值;


import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class tset {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //数据可以是集合或者数组--存储方式
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加数据
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700, 999);
        //创建执行的代码
        LotteryPool lp = new LotteryPool(list);
        //多线程运行结果
        FutureTask<Integer> ft1=new FutureTask<>(lp);
        FutureTask<Integer> ft2=new FutureTask<>(lp);
        //创建线程
        Thread t1=new Thread(ft1);
        Thread t2=new Thread(ft2);

        //设置名字
        t1.setName("奖池1");
        t2.setName("奖池2");
        //启动
        t1.start();
        t2.start();


        //返回
        System.out.println(ft1.get());
        System.out.println(ft2.get());


    }
}
