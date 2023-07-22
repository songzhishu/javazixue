package com.day08.test;

import com.day08.javabean.phone;

public class phonetest {
    public static void main(String[] args) {
        //创建对象
        phone A = new phone();

        A.setBrand("小米");
        A.setColor("褐色");
        A.setPrice(4444.3);
        A.call();
        A.sendAMessage();
    }
}
