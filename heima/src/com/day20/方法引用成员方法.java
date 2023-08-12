package com.day20;

import java.util.ArrayList;
import java.util.Collections;

public class 方法引用成员方法 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> lsit = new ArrayList<>();
        Collections.addAll(lsit, "蔡徐坤", "叶星成", "鹿哈", "刘不甜", "吴亦凡", "顾宇佳", "肖振良"
                , "赵丽颖", "杨颖", "高圆圆", "张天天", "刘诗诗", "杨幂", "迪丽娜扎", "杨过");


        //数据流
        lsit.stream().filter(s -> s.length() > 2 && s.startsWith("刘")).forEach(s -> System.out.println(s));
        System.out.println("-------------------------");

        //改写成成员方法
        lsit.stream().filter(new Singjudge()::judge).forEach(s -> System.out.println(s));

        //本类
        /*lsit.stream().filter(this::judge).forEach(s -> System.out.println(s)); 注释掉啦,不信可以解开看看*/
        //呜呜呜!报错了,因为静态方法没有this-------解决办法创建本类对象然后然后调用方法
        System.out.println("-------------------------");
        lsit.stream().filter(new 方法引用成员方法()::judge).forEach(s -> System.out.println(s));
    }

    public boolean judge(String s) {
        return s.length() > 2 && s.startsWith("刘");
    }

}
