package com.day07;

import java.util.Random;

public class 抽奖 {
    public static void main(String[] args) {
        //定义奖项数组
        int arr[] = {2, 55, 88, 99, 100};
        //定义抽后的奖项
        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            //随机抽取
            Random sc = new Random();
            int index = sc.nextInt(0, 4);
            int prize = arr[index];
            if (guide(newarr, prize) == false) {
                newarr[i] = prize;
                i++;
            }
        }

        //遍历奖项
        for (int i = 0; i < newarr.length; i++) {
            System.out.println("你的第" + i + "抽奖的结果" + newarr[i]);
        }

    }

    public static boolean guide(int x[], int prize) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
