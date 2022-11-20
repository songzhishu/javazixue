package com.day04;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("请输入你要判断的数：");
        int x = sr.nextInt();
        int temp = x;
        int num = 0;
        while (x != 0) {
            int wei = x % 10;
            x=x/10;
            num =num*10+wei;
        }
        System.out.println(num);
        System.out.println(num==temp);
    }
}