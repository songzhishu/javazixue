package com.day09;

import java.util.Scanner;

public class 输入字符串 {
    public static void main(String[] args) {
        //输出的字符串和定义的字符串的比较
        Scanner sr = new Scanner(System.in);
        System.out.println("输入一个字符串:");
        String str1 = sr.next();

        //直接赋值
        String str2 = "abc";
        //new出来的
        String str3 = new String("abc");

        //比较
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
