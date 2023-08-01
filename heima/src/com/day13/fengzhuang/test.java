package com.day13.fengzhuang;

public class test {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone("小米", 999);
        Phone.greensize = 6;
        p.call();
        p.plaggame();
        p.sendmessage();
        System.out.println(p.getBrand() + "," + p.getPrice() + "," + Phone.greensize);
    }
}
