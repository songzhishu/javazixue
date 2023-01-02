package com.day06;

public class 用重载判断数据是否一样 {
    public static void main(String[] args) {
        bijao(22, 33);
        bijao('s', 's');
    }
    //重载的方法

    public static void bijao(byte a1, byte a2) {
        System.out.println("byte");
        System.out.println(a1 == a2);
    }

    public static void bijao(short b1, short b2) {
        System.out.println("short");
        System.out.println(b1 == b2);
    }

    public static void bijao(int c1, int c2) {
        System.out.println("int");
        System.out.println(c1 == c2);
    }

    public static void bijao(long d1, long d2) {
        System.out.println("long");
        System.out.println(d1 == d2);
    }

}
