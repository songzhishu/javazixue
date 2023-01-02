package com.day07;

import java.util.Scanner;

public class 飞机票 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("输入机票原价:");
        double ticketPrice = sr.nextDouble();
        System.out.print("输入月份(1~12月):");
        int month = sr.nextInt();
        System.out.print("输入类型(1代表头等舱,2代表经济舱):");
        int type = sr.nextInt();
        System.out.println(surface(ticketPrice, month, type));

    }

    //方法
    public static double surface(double x, int y, int z) {
        double ticket = 0;
        if (y >= 5 && y <= 10) {
            switch (z) {
                case 1:
                    ticket = x * 0.9;
                    break;
                case 2:
                    ticket = x * 0.85;
                    break;
            }

        } else {
            switch (z) {
                case 1:
                    ticket = x * 0.7;
                    break;
                case 2:
                    ticket = x * 0.65;
                    break;
            }
        }

        return ticket;
    }
}
