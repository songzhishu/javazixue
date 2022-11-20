package com.day05;


public class 数组访问 {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6};
        //方法一
        int number=a[1];
        System.out.println(number);
        //方法二
        System.out.println(a[1]);
        //数组的赋值
        a[2]=100;
        System.out.println(a[2]);
    }
}