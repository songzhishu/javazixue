package com.day04;

import java.util.Random;
import java.util.Scanner;


public class 猜数字 {
    public static void main(String[] args) {
        //获取一个随机数
        Random sr = new Random();
        //int a= sr.nextInt(随机数的范围);
        int a = sr.nextInt(10000) + 1;
        while (true) {
            Scanner srin = new Scanner(System.in);
            System.out.print("输入你猜的数：");
            int b = srin.nextInt();
            if (a < b) {
                System.out.println("你猜大了！");
            } else if (a > b) {
                System.out.println("你猜小了");
            } else {
                System.out.println("你猜对了");
                break;
            }
        }
    }
}