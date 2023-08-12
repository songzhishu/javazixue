package com.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class 引用数组的构造方法 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);

        //存入数组
        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });

        //方法引用
        Object[] array1 = list.stream().toArray(Integer[]::new);


        System.out.println(Arrays.toString(array1));
    }
}
