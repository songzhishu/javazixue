package com.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class maptest {
    public static void main(String[] args) {
        //创建集合
        Map<String, String> map = new HashMap<>();
        //添加对象
        map.put("1", "7");
        map.put("2", "8");
        map.put("3", "9");
        map.put("4", "10");
        map.put("5", "11");
        map.put("6", "12");

        //利用Lambda遍历
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + "  " + s2);
            }
        });

        //利用Lambda遍历
        map.forEach((s, s2) -> System.out.println(s + "  " + s2));

    }
}
