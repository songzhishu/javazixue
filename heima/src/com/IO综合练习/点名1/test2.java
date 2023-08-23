package com.IO综合练习.点名1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class test2 {
    public static void main(String[] args) throws IOException {
        //读取本地文件吧
        //文本---字符缓冲流
        BufferedReader br = new BufferedReader(new FileReader("C:\\我的项目\\javazixue\\假数据姓名.txt"));

        String str;
        //创建集合
        ArrayList<String> arrayList = new ArrayList<>();

        while ((str = br.readLine()) != null) {
            arrayList.add(str);
        }
        br.close();

        //切割数据---只要名字  //但是要分为两组

        ArrayList<String> boylist = new ArrayList<>();
        ArrayList<String> girllist = new ArrayList<>();
        for (String s : arrayList) {
            //切割成为数组
            String[] strings = s.split("-");
            if (strings[1].equals("男")) {
                boylist.add(strings[0] + " 男");
            } else {
                girllist.add(strings[0] + " 女");
            }

        }

        /*System.out.println(boylist);
        System.out.println(girllist);*/

        //怎么随机但是有概率   男7女3
        ArrayList<Integer> numlist = new ArrayList<>();
        Collections.addAll(numlist, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0);
        //System.out.println(numlist.size());
        int boy=0,girl=0;
        for (int i = 0; i < 1000000; i++) {
            String name = rollCall(boylist, girllist, numlist);
            String[] s = name.split(" ");
            if (s[1].equals("男")){
                boy++;
            }else {
                girl++;
            }
        }
        System.out.println(boy);
        System.out.println(girl);


    }

    private static String rollCall(ArrayList<String> boylist, ArrayList<String> girllist, ArrayList<Integer> numlist) {
        //随机numlist
        Collections.shuffle(numlist);
        int integer = numlist.get(0);
        if (integer == 1) {
            //打乱集合
            Collections.shuffle(boylist);
            return boylist.get(0);
        }
        Collections.shuffle(girllist);
        return girllist.get(0);
    }
}
