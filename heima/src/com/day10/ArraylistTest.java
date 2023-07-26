package com.day10;

import java.util.ArrayList;

public class ArraylistTest {
    public static void main(String[] args) {
        //创建集合
        //泛型是<引用类型>指定存储的数据的类型,不加的时候是可以存储不同的数据类型
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);
        //添加元素
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("c");
        list.add("f");

        //指定位置添加
        list.add(5, "你好呀!");

        System.out.println(list);

        //删除指定索引
        list.remove(3);
        System.out.println(list);

        //删除指定元素(第一个出现的)
        list.remove("c");
        System.out.println(list);

        /*//删除指定范围的
        list.remove*/

        //修改数据
        list.set(4, "java");
        System.out.println(list);

        //查询
        System.out.println(list.get(3));

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
