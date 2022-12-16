package com.day05;

public class 数组的动态初始化 {
    //动态初始化就是定义数组的长度而数值是默认的,静态就是直接赋值
    public static void main(String[] args) {
        String arr[]= new String[50];
        arr[0]="张三";
        arr[1]="李四";
        System.out.println(arr[0]+arr[1]);

        //当访问没有初始化的数组元素时,其是默认数值
        //int的是0
        //double是0.0
        //string是null
        //char是空格
        //boolean是false

    }
}
