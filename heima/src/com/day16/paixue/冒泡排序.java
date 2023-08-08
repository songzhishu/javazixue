package com.day16.paixue;

import java.util.Random;

public class 冒泡排序 {
    //相邻的数据两两比较,小的在前,大的在后
    public static void main(String[] args) {
        //生成乱序
        int[] chaoarr = getChaosarr();
        for (int i = 0; i < chaoarr.length; i++) {
            System.out.print(chaoarr[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        //排序
        int[] sortarr = getSort(chaoarr);
        for (int i = 0; i < sortarr.length; i++) {
            System.out.print(sortarr[i] + " ");
        }

    }

    private static int[] getSort(int[] chaoarr) {
        int temp;
        //遍历数组外---->比较次数
        for (int i = 0; i < chaoarr.length - 1; i++) {
            //交换次序
            for (int j = 0; j < chaoarr.length - 1; j++) {
                if (chaoarr[j] >= chaoarr[j + 1]) {
                    temp = chaoarr[j + 1];
                    chaoarr[j + 1] = chaoarr[j];
                    chaoarr[j] = temp;

                }
            }
        }
        return chaoarr;
    }

    //生成乱序数组;
    private static int[] getChaosarr() {
        //随机数
        Random random = new Random();
        //定义数组
        int[] arr = new int[100];
        //遍历存储
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }

    //冒泡排序

}
