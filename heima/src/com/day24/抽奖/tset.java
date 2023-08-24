package com.day24.抽奖;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class tset {
    public static void main(String[] args) {
        //数据可以是集合或者数组--存储方式
        //创建集合
        ArrayList<Integer> list=new ArrayList<>();
        //添加数据
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
        //创建线程
        LotteryPool lp1=new LotteryPool(list);

        LotteryPool lp2=new LotteryPool(list);
        //设置名字
        lp1.setName("奖池1");
        lp2.setName("奖池2");
        //启动
        lp1.start();
        lp2.start();
    }
}
