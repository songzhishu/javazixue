package com.day09;

import java.util.Random;
import java.util.Scanner;

public class 输入字符打乱 {
    public static void main(String[] args) {
        //输入
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你的字符:");
        String str = sr.next();

        //改变内容 str.substring()截取   str.toCharArray()变成数组

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //打乱 随机数
        Random ra = new Random();
        for (int i = 0; i < arr.length; i++) {
            int a = ra.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
        }
        String str2 = new String(arr);
        //打印
        System.out.println(str2);

       /* //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //把字符串变成字符数组
        char[] arr = str.toCharArray();

        //将数组里面的内容打乱
        //打乱的核心要素：
        //遍历数组得到每一个元素与每一个随机索引处的数据进行交换
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        //将字符数组再变回字符串
        String newStr = new String(arr);

        //输出打印
        System.out.println(newStr);*/

    }
}
