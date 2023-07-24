package com.day09;

import java.util.Scanner;

public class 字符串的拼接和反转 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(arrtoString(arr));

        //键盘录入元素
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你要反转的字符串:");
        String str = sr.next();
        System.out.println(arrReversal(str));
    }

    //方法
    public static String arrtoString(int[] arr) {
        //首先判断数组是否合法,空或者长度唯一
        String result;
        if (arr == null) {
            return "";
        } else if (arr.length == 0) {
            return "[]";
        } else {
            result = "[";
            //开始拼接数组中的元素
            //获得数组中的元素
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    result += arr[i];
                } else {
                    result += arr[i] + ", ";
                }
            }
            result = result + "]";
        }
        return result;

    }

    public static String arrReversal(String str) {
        //首先遍历一下字符串获得单个字符
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
