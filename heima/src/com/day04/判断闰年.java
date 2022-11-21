package com.day04;

import java.util.Scanner;

/*中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，
四百年再闰。（年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。
请打印出1988年到2019年的所有闰年年份。*/
public class 判断闰年 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("输入年你要查询的起始年份:");
        int start= sr.nextInt();
        System.out.print("输入年你要查询的结束年份:");
        int end= sr.nextInt();
        while (start<end){
            if (start%4==0&&start%100!=0){
                System.out.println("闰年:"+start);
            }
            start=start+1;
        }


    }

}
