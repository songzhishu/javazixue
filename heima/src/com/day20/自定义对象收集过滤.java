package com.day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 自定义对象收集过滤 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<String> boylist = new ArrayList<>();
        ArrayList<String> grillist = new ArrayList<>();
        //添加数据
        Collections.addAll(boylist, "蔡徐坤,24", "叶星成,23", "鹿哈,25", "刘不甜,22", "吴亦凡,24", "顾宇佳,27", "肖振良,26");
        Collections.addAll(grillist, "赵丽颖,35", "杨颖,36", "高圆圆,46", "张天天,31", "刘诗诗,35", "杨幂,33", "迪丽娜扎,26", "杨过,23");

        Stream<String> stream = boylist.stream().filter(s -> (s.split(",")[0]).length() > 2).limit(3);
        Stream<String> stream1 = grillist.stream().filter(s -> (s.split(",")[0]).startsWith("杨")).skip(1);

        //合并
        /*List<Actor> collect = Stream.concat(stream, stream1).map(new Function<String, Actor>() {

            @Override
            public Actor apply(String s) {
                //获取名字
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                //添加创建对象
                return new Actor(name, age);
            }
        }).collect(Collectors.toList());*/


        //lambda表达式
        List<Actor> collect = Stream.concat(stream, stream1)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());


        System.out.println(collect);


    }
}
