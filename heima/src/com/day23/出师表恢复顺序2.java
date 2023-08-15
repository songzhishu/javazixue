package com.day23;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class 出师表恢复顺序2 {
    public static void main(String[] args) throws IOException {
        //读取
        //字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\a\\b\\出师表.txt"));

        //按行读取
        String line;
        //读取的数据
        TreeMap<Integer, String> tm = new TreeMap<>();

        while ((line = br.readLine()) != null) {
            //切割数据
            String[] str = line.split("\\.");
            //存入集合
            tm.put(Integer.parseInt(str[0]), str[1]);
        }
        br.close();
        /* System.out.println(tm);*/
        //写入
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\a\\出师表正确版2.txt"));

        //遍历map集合  三种方式  键值对  键找值  foreach
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getKey() + "." + entry.getValue());
            bw.newLine();
        }
        bw.close();

    }
}
