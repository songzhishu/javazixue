package com.day22;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 统计文件夹下的所有文件类型和数量 {
    public static void main(String[] args) {
        File flst = new File("");
        HashMap<String, Integer> getcount = getcount(flst);
        System.out.println(getcount);

    }

    //统计文件家里面的文件个数---返回值存储到map集合    键:后缀名 值:次数
    public static HashMap<String, Integer> getcount(File src) {
        //定义集合
        HashMap<String, Integer> hashMap = new HashMap<>();
        //进入文奸夹
        File[] files = src.listFiles();

        //遍历
        for (File file : files) {
            //判断是不是文件
            if (file.isFile()) {
                //获取后缀名
                String fileName = file.getName();
                String[] strings = fileName.split("\\.");
                if (strings.length >= 2) {
                    String endname = strings[1];
                    //再集合里面比较
                    if (hashMap.containsKey(endname)) {
                        //存在   获取值
                        int count = hashMap.get(endname);
                        count++;
                        //存入
                        hashMap.put(endname, count);
                    } else {
                        //直接存
                        hashMap.put(endname, 1);
                    }
                }

            } else {
                //不是文奸---那就是文件
                //子文件夹里面的数据统计
                //创建集合
                HashMap<String, Integer> sonHashMap = getcount(file);

                //遍历sonhashmap集合存入到hashmap中
                Set<Map.Entry<String, Integer>> entries = sonHashMap.entrySet();
                //entries键值对
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (hashMap.containsKey(key)) {
                        //如果子文件夹的key和父文件夹中的key有重复的---修改一下父类的值

                        //获取父类的键对应的值
                        int count = hashMap.get(key);
                        count += value;
                        //存入hashMap集合
                        hashMap.put(key, count);
                    } else {
                        //不存在---直接存入
                        hashMap.put(key, value);
                    }
                }


            }
        }

        return hashMap;
    }
}
