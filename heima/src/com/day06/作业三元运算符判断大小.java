package com.day06;

import java.util.Scanner;

public class 作业三元运算符判断大小 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入第一个数:");
        int a = sr.nextInt();

        System.out.println("输入第二个数:");
        int b = sr.nextInt();

        System.out.println("输入第三个数:");
        int c = sr.nextInt();

        System.out.println("最大值:" + max(a, b, c));
        shunxu(a, b, c);

    }

    public static int max(int x, int y, int z) {
        int d = x > y ? x : y;
        int e = d > z ? d : z;
        return e;

    }

    public static void shunxu(int x, int y, int z) {
        //找最大值
        int d = x > y ? x : y;
        int max = d > z ? d : z;
        //找最小值
        int e = x < y ? x : y;
        int min = e < z ? e : z;
        //找中间值
        int mid = x + y + z - min - max;

        System.out.println("从小到大的顺序:" + min + " " + mid + " " + max);
    }
}
