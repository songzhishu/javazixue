package com.day04;

import java.util.Scanner;

public class 用减法实现除法 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("输入被除数：");
        int a =sr.nextInt();
        System.out.print("输入除数：");
        int b =sr.nextInt();
        int i=0;
        while (a>=b){
            a=a-b;
            i++;
            // a=temp;
        }
        System.out.println("商"+i+"余数："+a);
    }
}