package com.day07;

import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        //定义数组
        int initialValue[] = new int[10];
        Scanner sr = new Scanner(System.in);
        //录入数据
        for (int i = 0; i < initialValue.length; i++) {
            System.out.println("请输入" + i + "位评委的打分值:");
            int a = sr.nextInt();
            initialValue[i] = a;
        }
        /*int aw[] = dafen(initialValue);
        for (int i = 0; i < aw.length; i++) {
            System.out.println(aw[i]);
        }*/
        System.out.println(dafen(initialValue));

    }

    //排序 除数 平均值
    public static double dafen(int x[]) {

        //冒泡排序
        for (int i = 0; i < x.length - 1; i++) {//这里要减一的原因是因为要留一个数给下一位比
            for (int j = 0; j < x.length - i - 1; j++) {//j的起点要从第二位起,也是要留一个数比,可以这样理解消除相同位置比较的这一种可能
                int temp = 0;
                if (x[j] > x[j + 1]) {
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        //剔除数据
        int arr[] = new int[x.length - 2];
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (index < 10) {
                arr[i] = x[index];
                index++;
            }
        }
        //求平均值
        double sum = 0;
        double averageValue = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            averageValue = sum / (arr.length);//如果不转换类型的话数据是不正确的,只取整数部分

        }
        return averageValue;
    }

}
