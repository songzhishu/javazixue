package com.day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class 存入map集合 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");

        //获取Stream流筛选
        list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                //第一个String是Stream流第二个String 是键的类型
                .collect(Collectors.toMap(new Function<String, String>() {
                                              @Override
                                              public String apply(String s) {
                                                  //获取键
                                                  return s.split(",")[0];
                                              }
                                          },//这个是分界线 前面是键的规则,后面的是值规则
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                //获取值 因为截取是字符串类型的所以要转换数据类型
                                return Integer.parseInt(s.split(",")[0]);
                            }
                        }));
    }
}
