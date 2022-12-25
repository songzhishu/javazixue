package com.day05;

import java.util.Scanner;

public class 作业录入并摆列大小 {
    public static void main(String[] args) {
      /*  //定义数组
        int arr[]={12,14,23,45,66,68,70,77,90,91};
        int arr1[]=new int[arr.length+1];
        //调用输入函数
        Scanner sr=new Scanner(System.in);
        System.out.print("请输入你要加入的数据:");
        int a= sr.nextInt();
        //遍历输入生成新数组
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
            arr1[arr1.length-1]=a;
            //System.out.println(arr1.length);
        }
        //比较大小
        int a=arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]<)
        }*/
        //1.定义长度为10的原数组
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        //2.定义长度为11的空数组
        int[] brr = new int[11];
        //3.键盘录入数组
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数数字");
        int num = sc.nextInt();
        //4.定义变量代表要插入的位置
        int index = 0;
        //5.循环遍历原数组
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= num) {
                //5.1如果元素小于等于要插入的数字，则直接存放
                brr[i] = arr[i];
                //5.2把i后面的位置记录下来
                index = i + 1;
            }else{
                //5.3如果元素大于要插入的数字,则往后一个位置存放
                brr[i+1] = arr[i];
            }
        }
        //6.index存储的就是要插入的位置
        brr[index] = num;
        //7.遍历新数组查看结果
        System.out.print("生成的新数组是：");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }



    }
}
