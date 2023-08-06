package com.day15.Bigint;

import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        //特点:对象一旦创建内部的值是不会发生改变的

        /*//获取随机大整数 范围0~2num次方-1
        for (int i = 0; i < 100; i++) {
            BigInteger b=new BigInteger(4,new Random());
            System.out.println(b);
        }*/

        //获取一个指定的大整数
        BigInteger b2 = new BigInteger("55489646463355555854994016346464");
        System.out.println((b2));

        //获取一个指定的大整数
        BigInteger b3 = new BigInteger("110101001", 2);
        System.out.println((b3));

        //用静态方法创建BigInteger(和long一样超过就没有办法用了)
        BigInteger B5 = BigInteger.valueOf(100);
        System.out.println(B5);

    }
}
