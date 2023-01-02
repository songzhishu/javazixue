package com.day06;

import java.util.Scanner;

public class 作业求绝对值 {
    public static void main(String[] args) {
        //输入
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入你要求绝对值的数:");
        double a = sr.nextDouble();
        System.out.println("绝对值是:" + jueduizhi(a));
    }

    public static double jueduizhi(double x) {
        double absoluteValue;
        if (x < 0) {
            absoluteValue = Math.abs(x);
        } else {
            absoluteValue = x;
        }
        return x;
    }
}
