package com.day08.test;

import com.day08.javabean.phone;

import java.util.Scanner;

public class phonetest {
    public static void main(String[] args) {
        //创建存放对象的数组
        phone[] arr = new phone[3];

        //输出数据
        Scanner sr = new Scanner(System.in);
        //创建对象
        for (int i = 0; i < arr.length; i++) {
            phone p = new phone();
            System.out.println("输入品牌:");
            String phonebrand = sr.next();
            //调用set赋值
            p.setBrand(phonebrand);


            System.out.println("输入价格:");
            double phoneprice = sr.nextDouble();
            p.setPrice(phoneprice);

            System.out.println("输入颜色:");
            String phonecolor = sr.next();
            p.setColor(phonecolor);

            //试了好几遍我们没有存入到数组,因为我没有写赋值语句给数组
            //导致我没有存入数据,再后面的调用中导致没有输出报错
            arr[i] = p;

        }
        System.out.println("输出存入的数据");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            phone d = arr[i];
            System.out.println("品牌:" + d.getBrand() + "价格:" + d.getPrice() + "颜色:" + d.getColor());
        }
        double pj = 0;
        //求平均值
        for (int i = 0; i < arr.length; i++) {
            phone c = arr[i];
            pj = c.getPrice() + pj;

        }
        System.out.println("三个的平均价格:" + pj / 3);


    }
}
