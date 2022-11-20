package com.day03;

import java.util.Scanner;

public class 作业 {
    public static void main(String[] args) {

        //题目一
        /* Scanner sr =new Scanner(System.in);
        System.out.println("请输入父亲的身高cm:");
        double x= sr.nextDouble();
        System.out.println("请输入母亲的身高cm:");
        double y= sr.nextDouble();
        double a,b;
        a=(x+y)*1.08/2;
        b=(x*0.923+y)/2;
        System.out.println("儿子:"+a+"女儿"+b);*/

        //题目二
       /* int hongcha=21,lvcha=24;
        hongcha=2*hongcha+3;
        lvcha=2*lvcha;
        System.out.println(hongcha==lvcha);*/

        //题目三
        /*double sum1,sum2;
        sum1=(24+8+3)>30?(24+8+3)*0.8:(24+8+3);
        sum2=16+8+3;
        System.out.println(sum1>sum2?sum1:sum2);*/

        //题目7
        Scanner sr =new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int x= sr.nextInt();
        int gewei=x%10;
        int shiwei=x/10%10;
        int baiwei=x/100;
        System.out.println(gewei+shiwei+baiwei);






    }
}
