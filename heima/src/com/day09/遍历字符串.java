package com.day09;

import java.util.Scanner;

public class 遍历字符串 {
    public static void main(String[] args) {
        //键盘输入信息
        Scanner sr = new Scanner(System.in);
        //输入信息
        System.out.println("输入字符串信息:");
        String str = sr.next();

        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //i就是字符串的索引
            //charat(int index)返回值是对应索引的字符
            char c = str.charAt(i);
            //打印输出
            System.out.print(c + " ");

        }

    }
}
