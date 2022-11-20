package com.day04;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int count= 0;
        Scanner sr = new Scanner(System.in);
        System.out.print("输入第一个数:");
        int a = sr.nextInt();
        System.out.print("输入第二个数:");
        int b = sr.nextInt();
        //不能将键盘录入的数直接用,而是复制给其他值才可以用
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
