package com.day05;

public class 求最值 {
    public static void main(String[] args) {
        int arr[]={33,5,22,44,55};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("最大值:"+max+"  最小值:"+min);
    }
}
