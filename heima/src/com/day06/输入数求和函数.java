package com.day06;

import java.util.Scanner;

public class 输入数求和函数 {
    public static void main(String[] args) {
        //带参数的方法
        //传递的参数和数据类型要一一对应
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你要计算的数");
        int a = sr.nextInt();
        int b = sr.nextInt();
        qiuhe(a, b);
    }

    public static void qiuhe(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
    }
}
