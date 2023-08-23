package com.IO综合练习.点名1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class test3 {

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


        //切割数据---只要名字
        ArrayList<String> listname = new ArrayList<>();
        for (String s : arrayList) {
            //切割成为数组
            String[] strings = s.split("-");
            //只要名字
            listname.add(strings[0]);
        }
        //System.out.println(listname);

        int num = 4;
        //创建集合
        ArrayList<String> temp=new ArrayList<>();
        RollCall(listname,temp,num);




    }

    private static void RollCall(ArrayList<String> listname,ArrayList<String> temp,int num) {

        while (num != 0) {
            //获取姓名
            Collections.shuffle(listname);
            String s = listname.get(0);
            if (!(temp.contains(s))) {
                //存入临时集合
                temp.add(s);
                System.out.println(s);
                if (temp.size() == 50) {

                    System.out.println("点完一轮");
                    //点完一轮 递归
                    //清空listname
                    listname.clear();
                    for (String s1 : temp) {
                        listname.add(s1);
                    }
                    temp.clear();
                    num--;
                    RollCall(listname, temp, num);
                }
            }
        }

    }
}
