package com.day08;

import com.day08.类.phone;

public class 手机测试 {
    public static void main(String[] args) {
        phone p = new phone();
        p.name = "小米";
        p.price = 999.0;
        System.out.println(p.name + p.price);
        p.call();
        p.playgame();
    }
}
