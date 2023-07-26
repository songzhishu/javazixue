package com.day09;

import java.util.Scanner;

public class 对称字符串 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sr = new Scanner(System.in);
        System.out.println("输入要判断的数字:");

        String str1 = sr.next();
        String str2 = new StringBuilder(str1).reverse().toString();


        //equals函数StringBuilder创建出来的不能用,而String创建出来的reverse()不能用

        if (str1.equals(str2)) {
            System.out.println("是");
        } else {
            System.out.println("否");
        }
    }
}
