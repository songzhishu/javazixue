package com.day03;

import java.util.Scanner;

public class 三元运算符 {
    public static void main(String[] args) {
        //输入两个数并判断最大值
        Scanner sr = new Scanner(System.in);
        System.out.print("请输入一个数:");
        int a=sr.nextInt();
        System.out.print("请输入另一个数:");
        int b=sr.nextInt();
        int max=a>b?a:b;
        System.out.println(max);

    }
}
