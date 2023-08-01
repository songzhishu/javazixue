package com.day13.jicheng4;

public class test {
    public static void main(String[] args) {
        //创建对象
        Lecturer L = new Lecturer("12", "张三");
        L.work();
        System.out.println("-----------------------------------------");
        Tutor T = new Tutor("34", "李四");
        T.work();
        System.out.println("-----------------------------------------");
        Maintainer M = new Maintainer("56", "王五");
        M.work();
        System.out.println("-----------------------------------------");
        Buyer B = new Buyer("78", "赵六");
        B.work();
    }
}
