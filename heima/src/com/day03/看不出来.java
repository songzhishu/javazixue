package com.day03;

import java.util.Scanner;

public class 看不出来 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("请输入一个数:");
        int a=sr.nextInt();
        System.out.print("请输入另一个数:");
        int b=sr.nextInt();
        System.out.println(a==6||b==6||(a+b)%6==0);
    }
}
