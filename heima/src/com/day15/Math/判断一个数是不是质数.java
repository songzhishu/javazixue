package com.day15.Math;

import java.util.Scanner;

public class 判断一个数是不是质数 {
    public static void main(String[] args) {
        //输入
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你要判断的数:");
        int num = sr.nextInt();

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("不是");
                return;
            }
        }
        System.out.println("是");


    }
}
