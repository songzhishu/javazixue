package com.day19;

import java.util.*;

public class 集合嵌套 {
    public static void main(String[] args) {
        //创建集合
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        //创建单列集合
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city1, "南京", "扬州", "苏州", "无锡", "常州");
        Collections.addAll(city2, "武汉", "孝感", "十堰", "宜昌", "鄂州");
        Collections.addAll(city3, "石家庄", "唐山", "邢台", "保定", "张家口");

        //添加到HashMap集合
        hm.put("江苏", city1);
        hm.put("湖北", city2);
        hm.put("河北", city3);

        /*//遍历
        hm.forEach(new BiConsumer<String, ArrayList<String>>() {
            @Override
            public void accept(String s, ArrayList<String> strings) {
                System.out.println(s +"="+strings);
            }
        });*/
        //键值对

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            //创建容器
            StringJoiner sj = new StringJoiner(",", "", "");
            for (String s : value) {
                sj.add(s);//存储到容器
            }

            System.out.println(key + " = " + sj);
        }
    }
}
