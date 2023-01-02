package com.day06;

import java.util.Scanner;

public class 作业判断一个数的位数 {
    public static void main(String[] args) {
        //输入
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你要判断的数:");
        int a = sr.nextInt();
        System.out.println("判断的位数是:" + judge(a));
    }

    public static int judge(int x) {
        int digit = 1;
        //刚开始,我们不知道他的循环次数,而for循环是要知道他的结束条件
        //while循环是只知道判断条件

        while (x > 10) {
            x = x / 10;
            digit++;
        }
        return digit;
    }
}
