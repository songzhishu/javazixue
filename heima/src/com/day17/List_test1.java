package com.day17;

import java.util.*;

public class List_test1 {
    public static void main(String[] args) {


        //创建集合
        //list是一个接口,所以不能直接创建其对象所以要用她的实现类来创建对象(多态)
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        //调用迭代器方法
        iterator(list);
        System.out.println("----------------------------------------");

        //调用增强for
        enhancedFor(list);
        System.out.println("----------------------------------------");

        //调用Lambda表达式简化
        Lambda(list);
        System.out.println("----------------------------------------");
        //调用普通for循环
        ordinaryfor(list);
        System.out.println("----------------------------------------");
        //调用列表迭代器
        listIterator(list);

    }

    //嗲带其
    public static void iterator(List<String> list) {
        //创建迭代器对象
        Iterator<String> t = list.iterator();
        while (t.hasNext()) {
            String s = t.next();
            System.out.println(s);
        }
    }

    //增强for
    public static void enhancedFor(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    //Lambda
    public static void Lambda(List<String> list) {
        //匿名内部类
       /* list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //简化Lambda
        list.forEach(s -> System.out.println(s));
    }

    //普通for循环
    public static void ordinaryfor(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //列表迭代器
    public static void listIterator(List<String> list) {
        ListIterator<String> t = list.listIterator();
        while (t.hasNext()) {
            String s = t.next();
            System.out.println(s);
        }
    }
}