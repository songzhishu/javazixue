package com.day06;

import java.util.Scanner;

public class 求长方形的周长 {
    public static void main(String[] args) {
        //传参
        Scanner sr = new Scanner(System.in);
        System.out.println("输入长和宽:");
        int c = sr.nextInt();
        int k = sr.nextInt();
        mianji(c, k);
    }

    public static void mianji(int x, int y) {
        int s = x * y;
        System.out.println("面积:" + s);
    }
}
