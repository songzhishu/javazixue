package com.day03;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.print("输入一个三位数:");
        Scanner sr =new Scanner(System.in);
        int x= sr.nextInt();
        int a,b,c;
        a=x/100;
        b=x/10%10;
        c=x%10;
        System.out.println("这个数百位:"+a+"十位:"+b+"各位:"+c);
    }
}
