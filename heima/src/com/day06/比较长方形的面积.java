package com.day06;

import java.util.Scanner;

public class 比较长方形的面积 {
    public static void main(String[] args) {
        //输入长宽
        Scanner sr = new Scanner(System.in);
        System.out.println("输入第一个长方形的长宽:");
        int a = sr.nextInt();
        int b = sr.nextInt();
        int s1 = getmianji(a, b);
        System.out.println("输入第二个长方形的长宽:");
        int c = sr.nextInt();
        int d = sr.nextInt();
        int s2 = getmianji(c, d);
        if (s1 > s2) {
            System.out.println("第一个面积大:" + s1 + " " + s2);
        } else {
            System.out.println("第二个面积大:" + s2 + " " + s1);
        }
        System.out.println(s2);
    }

    //实现求面积的函数
    public static int getmianji(int x, int y) {
        int s = x * y;
        return s;
        //在return的后面不能在写操作了因为return的标志就是函数的结束

    }
}
