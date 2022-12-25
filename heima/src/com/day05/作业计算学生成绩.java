package com.day05;

import java.util.Scanner;

public class 作业计算学生成绩 {
    public static void main(String[] args) {
        //定义成绩数组
        int arr[]=new int[10];
        int sum=0;
        //调用输入函数 输入学生成绩
        Scanner sr=new Scanner(System.in);
        //循环遍历用数组记录学生成绩
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入"+i+"号学生成绩:");
            int a= sr.nextInt();
            arr[i]=a;
            sum+=arr[i];
        }
        System.out.println("平均成绩:"+sum/ arr.length);

    }
}
