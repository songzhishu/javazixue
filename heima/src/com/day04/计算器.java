package com.day04;

import java.util.Scanner;

public class 计算器 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = sr.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sr.nextInt();
        System.out.println("请输入第三个整数:");
        int c = sr.nextInt();
        switch (c) {
            case 1:
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case 2:
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case 3:
                System.out.println(a + "*" + b + "=" + (a * b));
                break;

            case 4:
                System.out.println(a + "/" + b + "=" + (a / b));
                break;
            default:
                System.out.println("你想搞什么!");
        }
    }

}
