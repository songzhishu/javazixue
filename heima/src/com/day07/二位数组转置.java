package com.day07;

import java.util.Scanner;

public class 二位数组转置 {
    public static void main(String[] args) {
        //定义二维数组
        int[][] arr = new int[4][4];
        //输入数组值
        Scanner sr = new Scanner(System.in);
        //System.out.println(arr.length);
        //循环一维
        for (int i = 0; i < arr.length; i++) {
            //循环二维
            for (int j = 0; j < arr.length; j++) {
                System.out.print("请输入你要存放的" + i + " " + j + "的元素:");
                int a = sr.nextInt();
                arr[i][j] = a;
            }
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //循环二维
            for (int j = 0; j < arr.length; j++) {
                if (j < arr.length - 1) {
                    System.out.print("  " + arr[i][j] + "  ");
                } else {
                    System.out.println("  " + arr[i][3]);
                }
            }
        }

        System.out.println("转置后的二维数组:");
        int newarr[][] = reversal(arr);
        for (int i = 0; i < newarr.length; i++) {
            //循环二维
            for (int j = 0; j < newarr.length; j++) {
                if (j < newarr.length - 1) {
                    System.out.print("  " + newarr[i][j] + "  ");
                } else {
                    System.out.println("  " + newarr[i][3]);
                }
            }
        }

    }

    public static int[][] reversal(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            int temp = 0;
            switch (i) {
                case 0:
                    for (int j = 0; j < x.length; j++) {
                        temp = x[i][j];
                        x[i][j] = x[j][i];
                        x[j][i] = temp;
                    }
                    break;
                case 1:
                    for (int j = 1; j < x.length; j++) {
                        temp = x[i][j];
                        x[i][j] = x[j][i];
                        x[j][i] = temp;
                    }
                    break;
                case 2:
                    for (int j = 2; j < x.length; j++) {
                        temp = x[i][j];
                        x[i][j] = x[j][i];
                        x[j][i] = temp;
                    }
                    break;
                case 3:
                    for (int j = 3; j < x.length; j++) {
                        temp = x[i][j];
                        x[i][j] = x[j][i];
                        x[j][i] = temp;
                    }
                    break;
            }
        }
        return x;
    }


}
