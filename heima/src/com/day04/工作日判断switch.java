package com.day04;

import java.util.Scanner;

public class 工作日判断switch {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入一个整数代表星期几:");
        int day = sr.nextInt();
        switch (day) {
            //12以后的jdk的新特性:
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("没有这一天呀宝贝!");
        }
    }
}
