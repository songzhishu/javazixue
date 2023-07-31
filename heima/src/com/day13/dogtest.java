package com.day13;

public class dogtest {
    public static void main(String[] args) {
        //首先给静态变量赋值
        dog.hobby = "吃骨头!";

        //创建对象
        dog dog1 = new dog();
        System.out.println("dog1的地址值" + dog1);
        //赋值
        dog1.name = "小蒋";
        dog1.age = 18;

        //调用方法
        dog1.Show1();

        System.out.println("----------------------");

        //创建对象
        dog dog2 = new dog();
        System.out.println("dog2的地址值" + dog2);
        //赋值
        dog2.name = "小李";
        dog2.age = 20;

        //调用方法
        dog2.Show1();

    }
}
