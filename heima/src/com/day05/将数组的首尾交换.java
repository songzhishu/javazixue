package com.day05;

public class 将数组的首尾交换 {
    public static void main(String[] args) {
        //定义数组
        int []arr={1,2,3,4,5,6,7,8,9};
        int temp =0;
        //好好看一下这个代码
        //这个的大概意思就是,将i向后推进,将j向前推进,当i<j的时候循环结束
        for (int i = 0, j = arr.length-1; i<j;i++,j--) {
            //交换数据
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
