package com.IO综合练习.点名1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class test1 {

    public static void main(String[] args) throws IOException {
        //读取本地文件吧
        //文本---字符缓冲流
        BufferedReader br=new BufferedReader(new FileReader("C:\\我的项目\\javazixue\\假数据姓名.txt"));

        String str;
        //创建集合
        ArrayList<String> arrayList=new ArrayList<>();

        while((str= br.readLine())!=null){
            arrayList.add(str);
        }
        //System.out.println(arrayList);

        //切割数据---只要名字
        ArrayList<String> listname=new ArrayList<>();
        for (String s : arrayList) {
            //切割成为数组
            String[] strings = s.split("-");
            //只要名字
            listname.add(strings[0]);
        }
        //System.out.println(listname);


        //随机点名  搞一个循环用随机数或者打乱集合
        //打乱集合
        Collections.shuffle(listname);
        System.out.println(listname.get(0));
    }
}
