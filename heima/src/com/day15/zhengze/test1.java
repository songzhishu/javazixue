package com.day15.zhengze;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //输入
        Scanner sr = new Scanner(System.in);
        String qq = sr.next();
        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }
}
