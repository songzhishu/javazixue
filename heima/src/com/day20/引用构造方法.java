package com.day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class 引用构造方法 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三封,100", "张存善,40", "张良,35",
                "王二麻子,37", "谢广坤,41");


        List<Student> collect = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Student(name, age);

            }
        }).collect(Collectors.toList());

        List<Object> collect1 = list.stream().map(Student::new).collect(Collectors.toList());


        System.out.println(collect);
        System.out.println("----------------------");
        System.out.println(collect1);
    }

}
