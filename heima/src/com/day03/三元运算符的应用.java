package com.day03;

import java.util.Scanner;

public class 三元运算符的应用 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("请输入老虎体重:");
        int a=sr.nextInt();
        System.out.print("请输入另一个老虎体重:");
        int b=sr.nextInt();
        System.out.println(a==b?"相同":"不相同");
    }
}
