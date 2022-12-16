package com.day05;

import java.util.Random;

public class 遍历数组求和 {
    //生成随机数
    public static void main(String[] args) {
        //动态定义数组
        int arr[]=new int[10];
        Random src=new Random();
        for (int i = 0; i < arr.length; i++) {
            //循环一次就生成一个随机数
            int number= src.nextInt(100)+1;
            //将生成的随机数赋值到数组中
            arr[i]=number;
        }
        int sum=0,age=0,count=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            age=sum/arr.length;
            if(age>arr[i]){
                count=count+1;
            }
        }
        System.out.println("和是:"+sum+"平均数是:"+age+"小于平均数的个数:"+count);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
