package com.IO综合练习.点名2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) throws IOException {
        //1读取文件

        //文本---字符缓冲流
        BufferedReader br=new BufferedReader(new FileReader("C:\\我的项目\\javazixue\\假数据姓名.txt"));
        String str;
        //创建集合
        ArrayList<Student> stulist=new ArrayList<>();

        while ((str = br.readLine()) != null) {
            String[] arr = str.split("-");
            Student stu=new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            stulist.add(stu);
            
        }
        br.close();
        System.out.println(stulist);

        //计算权重
        double weight = 0;
        for (Student student : stulist) {
            weight=weight+student.getWeight();
        }
        //System.out.println(weight);

        //计算每一个人的占比
        double []arr=new double[stulist.size()];
        int index=0;
        for (Student student : stulist) {
            arr[index]= student.getWeight()/weight;
            index++;
        }
        //System.out.println(Arrays.toString(arr));

        //计算范围
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*(i+1);
        }
        System.out.println(Arrays.toString(arr));

        //抽取随机数
        double random = Math.random();
        System.out.println(random);

        //判断random在数组中的位置---二分法//插入点-1
        int result = -(Arrays.binarySearch(arr, random)+1);
        System.out.println(result);

        Student student = stulist.get(result);
        System.out.println(student);

        //修改权重
        double w = student.getWeight() / 2;
        student.setWeight(w);
        System.out.println(stulist);

        //写入本地文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\我的项目\\javazixue\\假数据姓名.txt"));
        for (Student student1 : stulist) {
            bw.write(student1.toString());
            bw.newLine();
        }

        bw.close();
    }
}
