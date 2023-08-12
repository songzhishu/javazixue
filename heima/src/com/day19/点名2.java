package com.day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class 点名2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //传入数据
        Collections.addAll(list, "男1", "男2", "男3", "男4", "男5", "男6", "男7", "男8", "男9", "男10", "男11", "男12", "男13", "男14", "男15", "男16", "男17", "男18", "男19", "男20", "女1", "女2", "女3", "女4", "女5", "女6", "女7", "女8", "女9", "女10");

        //获取随机数
        Random ra = new Random();
        //创建临时集合---->来存储已经点过名字的学生
        ArrayList<String> list2 = new ArrayList<>();


        int count = list.size();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < count; j++) {
                int index = ra.nextInt(list.size());
                String name = list.remove(index);//删除返回的元素
                list2.add(name);//将删除的元素加入备用集合
                System.out.println(name);
            }
            list.addAll(list2);
            list2.clear();
            System.out.println("------------------------");
        }


    }
}
