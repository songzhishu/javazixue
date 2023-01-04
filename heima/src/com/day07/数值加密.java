package com.day07;

import java.util.Scanner;

public class 数值加密 {
    public static void main(String[] args) {
        //输入要加密的数字
        Scanner sr = new Scanner(System.in);
        System.out.print("请输入你要加密的数值:");
        int originalCode = sr.nextInt();
        int originalCode1 = originalCode;
        //判断他是几位数
        int digit = 1;
        for (int i = 0; i < 10; i++) {
            if (originalCode > 10) {
                originalCode = originalCode / 10;
                digit++;
            }
        }
        System.out.println(originalCode1);
        //生成对应长度的数组
        int arr[] = new int[digit];
        /*System.out.println(arr.length);*/
        //将加密值存入数组
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            if (originalCode1 <= 9) {
                arr[0] = originalCode1;
            } else {
                arr[j] = originalCode1 % 10;
            }
            originalCode1 = originalCode1 / 10;
        }
        int afterEncryption[] = encryption(arr);
        System.out.print("[");
        for (int i = 0; i < afterEncryption.length; i++) {
            System.out.print(afterEncryption[i] + " ");
        }
        System.out.print("]");

    }


    public static int[] encryption(int x[]) {
        //进行加密操作
        for (int i = 0; i < x.length; i++) {
            x[i] = (x[i] + 5) % 10;
        }


        //反转
        int j = x.length - 1;
        for (int i = 0; i < x.length; i++) {
            if (x.length != 1) {
                if (i < j) {
                    int temp = 0;
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                    i++;
                    j--;
                }
            }
        }
        return x;
    }

    /*终于改完了 草!
     * 唯一的错误就是在得到用户输入的数据的时候
     * 我将原始值进行了取整导致原始值改变,然后我在后续的操作中将原始值直接传递
     * 以至于出现了当我输入一位数的时候正确,当出现多位数的时候出现错误
     * 同时呐,我也发现了我一个不好的地方 就是喜欢嘎嘎写代码 中途不检查
     * 循环不是太好*/
}
