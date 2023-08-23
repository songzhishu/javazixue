package com.day24.奇数;

import java.util.concurrent.ExecutionException;

public class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        //创建线程
        OddNumber t1=new OddNumber();
        OddNumber t2=new OddNumber();

        t1.setName("计算器1");
        t2.setName("计算器2");

        //开启
        t1.start();
        t2.start();


    }
}
