package com.day15.Math;

public class mathtest {
    public static void main(String[] args) {
        //math是一个工具类,可以帮助我们进行数学计算
        //私有化的构造方法,里面的方法都是静态的

        //简单常见的方法

        //abs()取绝对值
        System.out.println(Math.abs(-5));

        //向上取整
        System.out.println(Math.ceil(12.24));
        System.out.println(Math.ceil(12.64));

        //向下取整
        System.out.println(Math.floor(12.24));
        System.out.println(Math.floor(12.64));

        //四舍五入
        System.out.println(Math.round(12.24));
        System.out.println(Math.round(12.64));

        //最大值
        System.out.println(Math.max(12, 35));

        //最小值
        System.out.println(Math.min(12, 35));

        //取a的b次幂
        System.out.println(Math.pow(3, 6));
    }
}
