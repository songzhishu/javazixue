package com.day08.test;

import com.day08.javabean.car;

public class cartest {
    public static void main(String[] args) {
        //创建数组来存3个车对象
        car[] arr = new car[3];

        //输入
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            car c = new car();
            //赋值
            c.setName();
            c.setPrice();
            c.setColor();
            arr[i] = c;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            car car = arr[i];
            System.out.println(car.getName() + "," + car.getPrice() + "," + car.getColor());

        }

    }
}
