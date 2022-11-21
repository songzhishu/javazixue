package com.day04;

import java.util.Scanner;

public class 累加求和偶数for循环 {
    public static void main(String[] args) {
        int sum = 0, i, n;
        Scanner sr = new Scanner(System.in);
        System.out.print("输入你要求和的数:");
        n = sr.nextInt();
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = i + sum;
            }
        }
        System.out.println("从一加到该数的偶数和是" + sum);
    }
}

