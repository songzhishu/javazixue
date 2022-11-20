package com.day03;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        System.out.println("输入你的时髦程度:");
        int a= sr.nextInt();
        System.out.println("输入相亲对象的时髦程度:");
        int b=sr.nextInt();
        System.out.println(a>b);
    }
}
