package com.day06;

import java.util.Scanner;

public class 求圆的面积 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入圆的半径:");
        int r = sr.nextInt();
        yuanmian(r);
    }

    public static void yuanmian(int r) {
        double s = 3.14 * r * r;
        System.out.println("圆的面积:" + s);
    }
}
