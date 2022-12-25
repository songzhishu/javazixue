package com.day05;

import java.util.Random;

public class 作业随机数求和 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[6];
        int sum = 0;
        //调用随机函数
        Random sc = new Random();
        //存入数据
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt(0, 100);
            arr[i] = a;
            System.out.println("数组下标"+i+":"+ arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        System.out.print("和:"+sum);
    }
}
