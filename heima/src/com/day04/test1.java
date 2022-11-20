package com.day04;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你的会员等级:");
        int dengji = sr.nextInt();
        System.out.println("输入你的金额:");
        double money = sr.nextDouble();
        double shifumoney;
        if (dengji == 1) {
            shifumoney = money * 0.9;
            System.out.println("你的实付金额:" + shifumoney);
        } else if (dengji == 2) {
            shifumoney = money * 0.8;
            System.out.println("你的实付金额:" + shifumoney);
        } else if (dengji == 3) {
            shifumoney = money * 0.7;
            System.out.println("你的实付金额:" + shifumoney);
        } else {
            System.out.println("没有折扣呀" + money);
        }
    }
}
