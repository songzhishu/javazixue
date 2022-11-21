package com.day04;

// 让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。

import java.util.Scanner;

public class 判断三个数最小值 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入第一个数:");
        int a = sr.nextInt();
        System.out.println("输入第二个数:");
        int b = sr.nextInt();
        System.out.println("输入第三个数:");
        int c = sr.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("最小值:" + c);
            } else {
                System.out.println("最小值:" + b);
            }
        }
        if (b > a && b > c) {
            if (a > c) {
                System.out.println("最小值:" + c);
            } else {
                System.out.println("最小值:" + a);
            }
        }

        if (c > b && c > a) {
            if (b > a) {
                System.out.println("最小值:" + a);
            } else {
                System.out.println("最小值:" + b);
            }
        }



    }
}
