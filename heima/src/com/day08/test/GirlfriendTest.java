package com.day08.test;

import com.day08.javabean.GirlFriend;

public class GirlfriendTest {
    public static void main(String[] args) {
        //创建对象
        GirlFriend npy1 = new GirlFriend();

        //赋值
        npy1.setName("小花");
        npy1.setHeight(188.0);
        npy1.setWeight(100.0);
        npy1.cook();
        npy1.wash();
        npy1.show();


    }
}
