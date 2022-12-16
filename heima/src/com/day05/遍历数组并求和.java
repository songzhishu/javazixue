package com.day05;

public class 遍历数组并求和 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("和是:"+sum);
    }
}
