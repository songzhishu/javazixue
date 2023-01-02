package com.day06;

import java.util.Scanner;

public class 方法赋值数组 {
    public static void main(String[] args) {
        //定义数组
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你要复制数组的起始下标:");
        int start = sr.nextInt();
        System.out.println("输入你要复制数组的结尾下标:");
        int end = sr.nextInt();
        //赋值调用
        int[] arr1 = copyarr(arr, start, end);
        //遍历复制后的数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }

    public static int[] copyarr(int[] arr, int start, int end) {
        //定义新数组
        int[] arr1 = new int[end - start];
        //伪造一个索引
        int index = 0;
        for (int i = start; i < end; i++) {
            arr1[index] = arr[i];
            /*如果直接写i,我们新定义的数组长度是小的,
            当我们复制的下标大于新定义的数组的时候就会出错
            要解决这个问题的方法就是搞一个新的访问下标
            用新定义的小标的变化,来改变访问的数组  这里就是index*/

            index++;
        }
        return arr1;
    }

}

