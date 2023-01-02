package com.day06;

import java.util.Scanner;

public class 方法数组遍历求大值判断是不是在数组中 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {55, 80, 96, 35, 46, 97};
        bianli(arr);
        MAXMIN(arr);
        System.out.println(panduan(arr));

    }

    public static void bianli(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    /*java中函数的返回值只能是一个或者零个*/
    public static void MAXMIN(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最大值:" + max + "最小值:" + min);
    }

    public static boolean panduan(int arr[]) {
        Scanner sr = new Scanner(System.in);
        System.out.print("请输入你要判断的数据:");
        int a = sr.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
        /*如果我在循环里写else return false 那么这个循环就循环一次*/
    }
}
