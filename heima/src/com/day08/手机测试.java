package com.day08;

import com.day08.类.phone;

public class 手机测试 {
    public static void main(String[] args) {
        phone p = new phone();
        p.name = "小米";
        p.price = 999.0;
        System.out.println(p.name + " " + p.price);
        p.call();
        p.playgame();

        //再创建一个手机
        phone p2 = new phone();

        p2.name = "华为";
        p2.price = 9999.0;

        System.out.println(p2.name + " " + p2.price);

        p2.call();
        p2.playgame();
    }
}
