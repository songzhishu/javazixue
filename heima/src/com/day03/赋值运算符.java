package com.day03;

public class 赋值运算符 {
    public static void main(String[] args) {
         //+=(同理-=,*=,/=,%= 但是这些底层都隐藏了一个强制转换)
        short a=10;
        a+=10;//等同于 a=(short)(a+10)
        System.out.println(a);

    }
}
