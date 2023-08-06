package com.day16.find;

import java.util.ArrayList;

public class 基本查找 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {12, 2, 36, 46, 59, 5, 4, 68, 7, 98, 74, 8, 74, 41, 64, 59, 45, 94};
        int number = 59;
        /*if (basicFind(arr,number)==0) {
            System.out.println("你要查找的数据不存在!");
        }else {
            System.out.println("你要查找的数据存在在数组中的索引为:"+basicFind(arr,number));
        }*/
        int[] ints = basicFind(arr, number);
        //遍历
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                System.out.println(ints[i]);
            }
        }
        ArrayList<Integer> list = basicFind1(arr, number);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    private static int[] basicFind(int[] arr, int number) {
        //遍历
        //定义数组
        int[] index = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index[i] = i;
            }
        }
        return index;
    }

    private static ArrayList<Integer> basicFind1(int[] arr, int number) {
        //定义集合
        ArrayList<Integer> list = new ArrayList<>();
        //遍历
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }

}
