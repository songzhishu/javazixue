package com.day18;

import java.util.StringJoiner;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        //统计字符串中字符出现的个数

        //定义字符串
        String s = "aababcacdabcde";

        //创建集合
        TreeMap<Character, Integer> tm = new TreeMap<>();

        //遍历字符串得到字符串中的字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)) {
                //存在---该变当前存在的键所对应的值
                int integer = tm.get(c);
                integer++;
                tm.put((c), integer);
            } else {
                //不存在
                tm.put((c), 1);
            }
        }
        /*System.out.println(tm);*/
        //拼接
        StringJoiner sj = new StringJoiner("", "", "");
        tm.forEach((character, integer) -> sj.add(character + "(").add(integer + ")"));
        System.out.println(sj);


        StringBuffer sb = new StringBuffer();
        tm.forEach((character, integer) -> sb.append(character).append("(").append(integer).append(")"));
        System.out.println(sb);

    }
}
