package com.day14.neibulei;

public class test {
    public static void main(String[] args) {
        //创建静态内部类对象
        outer.inner oi = new outer.inner();
        //调用非静态方法
        oi.show();
        //调用静态方法
        //方式一不提倡
        oi.show2();
        //方式二
        outer.inner.show2();
    }
}


