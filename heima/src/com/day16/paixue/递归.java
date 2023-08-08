package com.day16.paixue;

public class 递归 {
    public static void main(String[] args) {
        //什么是递归,就是方法调用自己,但是一直调用的话会出现内存的溢出,所以递归一定有出口!
        //方法的返回,返回到调用的地方
        //求和
        int number = 9;
        int sum = getsum(number);
        int sum1 = getfactorial(number);
        System.out.println("累加:" + sum);
        System.out.println("阶乘:" + sum1);
    }

    //累加
    private static int getsum(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + getsum(number - 1);
        }
    }

    //阶乘
    private static int getfactorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * getsum(number - 1);
        }
    }
}
