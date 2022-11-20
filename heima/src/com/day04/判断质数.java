package com.day04;

import java.util.Scanner;


public class 判断质数 {
    public static void main(String[] args) {
        boolean flaw = true;
        Scanner sr = new Scanner(System.in);
        System.out.print("请输入要判断的数：");
        int number = sr.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flaw = false;
                break;
            }
        }
        if (flaw) {
            System.out.println("是个质数");
        } else {
            System.out.println("不是质数");
        }
    }
}

