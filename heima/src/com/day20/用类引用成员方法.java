package com.day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class 用类引用成员方法 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd", "eee", "fff");

        //数据流
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {

                return s.toUpperCase();
            }
        }).forEach(s -> System.out.println(s));

        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
