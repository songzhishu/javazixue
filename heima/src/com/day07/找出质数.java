package com.day07;

import java.util.Scanner;

public class 找出质数 {
    public static void main(String[] args) {
        //输入起始和结束
        Scanner sr = new Scanner(System.in);
        System.out.print("输入起始值:");
        int start = sr.nextInt();

        System.out.print("输入结束值:");
        int end = sr.nextInt();

        System.out.println("这段范围里的质数的个数:" + primeNumber(start, end).length);
        int arr[] = primeNumber(start, end);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] primeNumber(int x, int y) {
        //boolean initialValue=true;
        int sum = 0;
        // boolean chuzhi=true;
        /*因为直接定义数组的话,我们不知道他的起始长度 也就是我们要求的范围里质数
         * 所以我们要先求一下数组的长度 sum*/
        for (int i = x; i < y; i++) {
            boolean chuzhi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    chuzhi = false;
                    break;
                } /*else {
                    sum++;
                    break;
                }*/
            }
            if (chuzhi = true) {
                sum++;
            }
        }
        //记录数组的值
        int arr[] = new int[sum];
        int index = 0;
        for (int i = x; i < y; i++) {
            //判断质数
            boolean chuzhi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    chuzhi = false;
                    break;
                }
            }
            if (chuzhi = true) {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }
}
