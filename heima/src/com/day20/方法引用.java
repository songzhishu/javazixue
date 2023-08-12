package com.day20;

import java.util.ArrayList;
import java.util.Collections;

public class 方法引用 {
    public static void main(String[] args) {
        //静态引用

        //创建集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6", "7");

        //转换成int
/*
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {

                return Integer.parseInt(s);
            }
        }).forEach(s -> System.out.println(s));
*/
        //Integer--------类名   parseInt-------静态方法
        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));

    }

}
