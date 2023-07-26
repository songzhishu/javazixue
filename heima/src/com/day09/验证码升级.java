package com.day09;

import java.util.Random;

public class 验证码升级 {
    public static void main(String[] args) {
        //打乱
        char[] arr = huoqu();
        //生成随机索引
        Random ra = new Random();
        int index = ra.nextInt(arr.length);
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            char temp;
            temp = arr[index];
            arr[index] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;

        }

        System.out.println(arr);
    }

    public static char[] huoqu() {
        char arrAa[] = new char[52];
        for (int i = 0; i < arrAa.length; i++) {
            //添加小写字母
            if (i <= 25) {
                arrAa[i] = (char) (97 + i);
            }
            //添加大写字母
            else {
                arrAa[i] = (char) (39 + i);
            }
        }
        char code[] = new char[5];
        //随机抽取字母
        Random sc = new Random();
        for (int i = 0; i < code.length - 1; i++) {
            int index = sc.nextInt(0, 52);
            code[i] = arrAa[index];
        }
        //定义数字数组
        char arr1[] = new char[9];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (char) (48 + i);
        }
        //随机抽取数字
        Random sc1 = new Random();
        int index = sc.nextInt(0, 9);
        code[4] = arr1[index];
        return code;
    }
}