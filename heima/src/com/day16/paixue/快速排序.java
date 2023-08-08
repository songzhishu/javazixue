package com.day16.paixue;

import java.util.Random;

public class 快速排序 {
    //以0索引作为基准数,然后确定基准数的位置
    public static void main(String[] args) {
        //生成乱序
        int[] chaoarr = getChaosarr();

        for (int i = 0; i < chaoarr.length; i++) {
            System.out.print(chaoarr[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        int start = 0;
        int end = chaoarr.length - 1;

        //排序
        getSort(chaoarr, start, end);

        for (int i = 0; i < chaoarr.length; i++) {
            System.out.print(chaoarr[i] + " ");
        }

    }

    private static void getSort(int[] arr, int begin, int end) {
        //递归的出口
        if (begin > end)
            return;
        int tmp = arr[begin];
        int i = begin;
        int j = end;
        while (i != j) {
            //end往前找比基准数小的---结束条件是end小于begin或者找到了
            while (arr[j] >= tmp && j > i)
                //没有找到就继续往前
                j--;
            //begin往后找比基准数大的----结束条件是end小于begin或者找到了
            while (arr[i] <= tmp && j > i)
                i++;
            //如果当begin大于end时,要交换begin和end所对应的数值
            if (j > i) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        //此时一轮结束,为下一轮做准备,此时begin和end在同一个位置
        arr[begin] = arr[i];
        arr[i] = tmp;
        //调用方法递归
        getSort(arr, begin, i - 1);
        getSort(arr, i + 1, end);
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


}
