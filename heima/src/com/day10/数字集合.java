package com.day10;

import java.util.ArrayList;

public class 数字集合 {
    public static void main(String[] args) {
        //基本数据类型的包装类
        /*byte ---->Byte
        short----->Short
        char------>Character
        int------>Integer
        long------>Long
        float----->Float
        double----->Double
        boolean---->Boolean*/

        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("[");
        //遍历
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "]");
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
    }
}
