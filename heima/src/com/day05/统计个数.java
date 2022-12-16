package com.day05;

public class 统计个数 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0) {
                sum++;
            }
        }
        System.out.println("能整除3的数有:"+sum+"个");
    }
}
