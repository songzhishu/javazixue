package com.day13.jicheng3;

public class test {
    public static void main(String[] args) {
        //创建对象
        manager m = new manager("123456", "张三", 4546, 555);

        m.show();
        System.out.println("---------------------------------------");
        works w = new works("12345", "李四", 10000);
        w.show();

    }
}
