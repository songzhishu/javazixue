package com.day13;

import java.util.ArrayList;

public class maxageutil {
    private maxageutil() {
    }

    public static int maxage(ArrayList<Student> list) {
        //遍历
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int age = list.get(i).getAge();
            //获取年龄
            if (list.get(i).getAge() > max) {
                max = age;
            }
        }
        return max;
    }
}
