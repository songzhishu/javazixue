package com.day05;


public class 数组的遍历 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        /*  for (int j=0;j<i;j++){
            System.out.println(arr[j]);
        }*/
        System.out.println(arr.length);
        //idea的遍历的有快捷方式 数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}