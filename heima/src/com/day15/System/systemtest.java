package com.day15.System;

import java.io.IOException;

public class systemtest {
    public static void main(String[] args) throws IOException {
        System.out.println("1");
        //System.exit(0);   //0----->正常退出,非零------>不正常退出
        System.out.println("2");
        System.out.println(System.currentTimeMillis());

        //获取cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //内存总大小
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //已经获取的内存
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //空闲的内存
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //运行cmd命令
        /*shutdown :关机
        -s 默认一分钟后关机
        -s -t 指定时间关机
        -a 取消关机操作
        -r 关机并重启
        **/
        /*Runtime.getRuntime().exec("notepad");
        Runtime.getRuntime().exec("qq.exe");*/
        /*Runtime.getRuntime().exec("shutdown -s -t 120");
        Runtime.getRuntime().exec("shutdown -a");*/

        /*object类只有空参构造
         * */
    }
}
