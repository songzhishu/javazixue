package com.day05;

public class 作业数组的个十百千 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {2, 1, 3, 5, 4};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num=num*10+arr[i];
        }
        System.out.println(num);
    }
}
//他说减一我不理解,减一的话循环次数少一,那么结果就不对了