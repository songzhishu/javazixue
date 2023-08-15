package com.day23;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class 读取数据并修改 {
    public static void main(String[] args) throws IOException {
        //读取数据
        FileReader fr = new FileReader("c.txt");
        //创建容器
        StringBuilder sb = new StringBuilder();

        int ch;
        while ((ch = fr.read()) != -1) {
            //读取出来强制转换成char存入sb
            sb.append((char) ch);

        }
        //关闭资源
        fr.close();
        System.out.println(sb);

        //数据处理
        //转成字符---为了切割字符串
        String str = sb.toString();
        //切割数据---存入数组
        String[] strings = str.split("-");

        ArrayList<Integer> list = new ArrayList<>();
        //数据转换成int
        for (String string : strings) {
            int anInt = Integer.parseInt(string);
            //存储到集合
            list.add(anInt);
        }

        Collections.sort(list);
        System.out.println(list);

        //写入数据
        //没有参数---直接覆盖
        FileWriter fw = new FileWriter("c.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                fw.write((list.get(i)) + "");
            } else {
                fw.write((list.get(i)) + "-");
            }

        }
        fw.close();


    }
}
