package com.day06;

import java.util.Scanner;

public class 有返回值的方法 {
    public static void main(String[] args) {
        //方法调用的方式
        /*1直接调用 也就是不做处理
         * 方法名(实参);
         * 2赋值调用
         * 整数类型 变量名 =方法名(实参);
         * 3输出调用
         * sout(方法名(实参));
         * */
        //先计算每个季度的营业额,然后计算一整年的营业额
        //输入一个季度的每月的营业额
        Scanner sr = new Scanner(System.in);
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("输入第" + i + "月的营业额:");
            int a = sr.nextInt();
            int b = sr.nextInt();
            int c = sr.nextInt();
            sum1 = jidu(a, b, c);

        }


    }

    public static int jidu(int x, int y, int z) {
        int jiduhe = x + y + z;
        return jiduhe;
    }
}
