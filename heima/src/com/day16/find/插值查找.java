package com.day16.find;

public class 插值查找 {
    public static void main(String[] args) {
        //使用插值查找的前提条件是数据必须是有序的------>有规律的
        //每次排出一半的查找范围
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int number = 4;
        int i = binarySearch(arr, number);
        if (i != -1) {
            System.out.println(i);
        } else {
            System.out.println("不存在前");
        }

    }

    private static int binarySearch(int[] arr, int number) {
        //定义起始和末尾
        int min = 0;
        int max = arr.length - 1;
        System.out.println(System.currentTimeMillis());
        //遍历
        while (true) {
            if (min > max) {
                System.out.println(System.currentTimeMillis());
                return -1;
            }
            int mid = min + (number - arr[min]) * arr.length / (arr[max] - arr[min]);
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                System.out.println(System.currentTimeMillis());
                return mid;
            }
        }
    }
}
