package com.day09;

import java.util.Scanner;

public class 金额转换 {
    public static void main(String[] args) {
        //键盘录入元素
        Scanner sr = new Scanner(System.in);
        long money;
        while (true) {
            System.out.println("输入的金额:");
            money = sr.nextLong();
            //金额判断
            if (money >= 0 && money <= 999999999) {
                break;
            } else {
                System.out.println("金额无效!");
            }
        }
        //拼接
        String result = "";
        while (true) {
            //数字的获取和转换

            //取个位(取余)
            long number = money % 10;
            //取整
            money = money / 10;
            //System.out.println(number);
            //调用函数拼接
            result = digitalConversion(number) + result;
            if (money == 0) {
                break;
            }
        }
        //System.out.println(result);

        //得到以上结果后进行后面的操作
        /*补零
         * 现获取补零的个数*/
        int num = 9 - result.length();
        //补零
        for (int i = 0; i < num; i++) {
            result = "零" + result;
        }
        System.out.println(result);

        //补单位
        String endresult = "";
        String[] unit = {"亿", "仟", "佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < result.length(); i++) {
            //获取单个后拼接
            endresult = endresult + result.charAt(i) + unit[i];
        }
        System.out.println(endresult);

    }

    //数字转换
    public static String digitalConversion(long number) {
        //定义金额字符串数组
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[(int) number];
    }

}
