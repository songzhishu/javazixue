package com.day18;

import java.util.*;

public class HashMaptest {
    public static void main(String[] args) {
        //创建集合
        HashMap<String, Integer> hm = new HashMap<>();

        //定义数组存储景点
        String[] arr = {"A", "B", "C", "D"};

        //产生随机数并存储到集合
        ArrayList<String> list = new ArrayList<>();
        Random ra = new Random();
        for (int i = 0; i < 80; i++) {
            int index = ra.nextInt(arr.length);
            list.add(arr[index]);

        }

        for (String s : list) {
            //判断当前景点是否存在
            if (hm.containsKey(s)) {
                //存在
                //获取当前已经投票的数量
                Integer count = hm.get(s);
                count++;
                hm.put(s, count);
            } else {
                //不存在,直接添加进集合
                hm.put(s, 1);
            }
        }

        System.out.println(hm);

        //统计最大值
        int max = 0;
        //遍历map
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            //获取值
            int value = entry.getValue();
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
        for (Map.Entry<String, Integer> entry : entries) {
            //获取值
            int value = entry.getValue();
            if (value == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
