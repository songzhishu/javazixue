package com.day15.Math;

public class 水仙花数 {
    public static void main(String[] args) {

        //循环
        for (int i = 100; i <= 999; i++) {
            if (judge(i) != 0) {
                System.out.println(i);
            }
        }

    }

    static int g = 0;
    static int s = 0;
    static int b = 0;

    //判断几位数或者取数字
    public static int judge(int num) {
        g = num % 10;
        s = num / 10 % 10;
        b = num / 100 % 10;
        if (num == (Math.pow(g, 3) + Math.pow(s, 3) + Math.pow(b, 3))) {
            return num;
        }
        return 0;
    }
}
