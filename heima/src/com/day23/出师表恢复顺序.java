package com.day23;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 出师表恢复顺序 {
    public static void main(String[] args) throws IOException {
        //读取
        //字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\a\\b\\出师表.txt"));

        //按行读取
        String line;
        //读取的数组
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            //存入集合
            list.add(line);
        }
        br.close();
        //System.out.println(list);

        //排序  每一行的第一个数字

       /* Collections.sort(list);
        System.out.println(list);*/
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //这里是两个对象,然后比较大小
                int anInt1 = Integer.parseInt(o1.split("\\.")[0]);//前面的序号,转成整数
                int anInt2 = Integer.parseInt(o2.split("\\.")[0]);//前面的序号,转成整数
                return anInt1 - anInt2;
            }
        });
        //System.out.println(list);

        //存入数据----写入
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\a\\出师表正确版.txt"));


        for (String s : list) {
            //写入
            bw.write(s);
            //换行
            bw.newLine();
        }

        //关流
        bw.close();
    }
}
