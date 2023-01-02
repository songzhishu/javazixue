package com.day06;

public class 作业判断数组是否相同 {
    public static void main(String[] args) {
        //定义数组
        int arr[] = {1, 2, 3};
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {2, 3, 4};
        int arr3[] = {1, 2, 3};
        System.out.println(equals(arr, arr1));
        System.out.println(equals(arr, arr2));
        System.out.println(equals(arr, arr3));


    }

    //方法
    public static boolean equals(int arr[], int arr1[]) {
        //首先判断长度是不是相同
        if (arr.length == arr1.length) {
            //遍历内容看是不是相同
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr1[i]) {
                    return true;
                }
            }
        }
        return false;
        //刚开始我的思路是判断他不相同,然后实行起来比较复杂
        //但是判断他相同的可能就相对简单一点,在长度相同的基础上
        //遍历判断内容
    }
}
