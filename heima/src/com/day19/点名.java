package com.day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class 点名 {
    public static void main(String[] args) {
        //如何实现随机且有概率的抽取

        //定义集合
        ArrayList<Integer> list = new ArrayList<>();
        //存入数据
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        //打乱集合
        Collections.shuffle(list);
        System.out.println(list);

        //创建随机数抽取数据
        Random ra = new Random();
        int index1 = ra.nextInt(list.size());
        System.out.println(index1);
        //获取到list中的数据
        Integer index = list.get(index1);


        System.out.println(index);
        //存储学生信息 男女
        ArrayList<String> boylist = new ArrayList<>();
        ArrayList<String> girllist = new ArrayList<>();
        //存储学生信息
        Collections.addAll(boylist, "男1", "男2", "男3", "男4", "男5", "男6", "男7", "男8", "男9", "男10", "男11", "男12", "男13", "男14", "男15", "男16", "男17", "男18", "男19", "男20");
        Collections.addAll(girllist, "女1", "女2", "女3", "女4", "女5", "女6", "女7", "女8", "女9", "女10");


        //判断index抽取的数据
        if (index == 1) {
            //抽取男
            int indexboy = ra.nextInt(boylist.size());
            //获取数据
            System.out.println(boylist.get(index));
        } else {
            int indexgirl = ra.nextInt(girllist.size());
            //获取数据
            System.out.println(girllist.get(indexgirl));

        }


    }
}
