package com.day08;

public class GirlfriendTest {
    public static void main(String[] args) {
        //创建对象
        GirlFriend npy1 = new GirlFriend();

        //赋值
        npy1.name = "小李";
        npy1.weight = 90;
        npy1.age = 18;
        System.out.println(npy1.name + " " + npy1.weight + " " + npy1.age);
        //调用方法
        npy1.seelp();
        npy1.eat();


    }
}
