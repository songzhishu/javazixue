package com.day05;

public class 变量值的交换 {
    public static void main(String[] args) {
        //变量之间的数值调换,需要从中间调入一个中间变量
        int a = 20;
        int b = 30;
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + "he" + b);
        //数组之间的调换(以数组的下标)
        int  [] arr={1,2,3,4,5,6};
        int t=0;
        t=arr[0];
        arr[0]=arr[5];
        arr[5]=t;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
