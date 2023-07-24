package com.day09;

import java.util.Scanner;

public class 统计字符大小写 {
    public static void main(String[] args) {
        //键盘输入信息
        Scanner sr = new Scanner(System.in);
        //输入信息
        System.out.println("输入字符串信息:");
        String str = sr.next();
        int bigcount = 0, smallcount = 0, numbercount = 0, other = 0;

        for (int i = 0; i < str.length(); i++) {
            //首先捕获字符串的单个字符
            //char类的变量在进行计算的时候会自动转换为int
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                smallcount++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                bigcount++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numbercount++;
            } else {
                other++;
            }
        }
        System.out.println("小写字母" + smallcount + "大写字母" + bigcount + "数字" + numbercount + "其他" + other);
    }
}
