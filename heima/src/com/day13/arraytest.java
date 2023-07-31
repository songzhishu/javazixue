package com.day13;

public class arraytest {
    public static void main(String[] args) {
        //定义数组
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        float[] arr2 = {1.2F, 1.3F, 1.4F, 1.5F, 1.6F};

        //调用util类的静态方法
        arrayutil.printarr(arr1);
        System.out.println(arrayutil.getaverage(arr2));
    }
}
