package com.day04;

import java.util.Scanner;

public class switch语句 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你号码:");
        int number = sr.nextInt();

        switch (number) {
            case 111:
                System.out.println("一等奖");
                break;
            case 222:
                System.out.println("二等奖");
                break;
            case 333:
                System.out.println("三等奖");
                break;
            case 444:
                System.out.println("四等奖");
                break;
            default:
                System.out.println("谢谢参与");
                break;
        }
        /* 1 default的位置和省略
         * 2 break不可以省略  如果程序没有发现break会继续执行case语句,直到执行完
         * 3 jdk12以后的新特性
         * 4 if与switch的适用范围的区别
         *   if适用于对范围的判断
         *   switch适用于对有限个数据列举出来
         * */

    }
}
