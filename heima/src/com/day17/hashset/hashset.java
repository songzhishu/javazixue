package com.day17.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<student> lsit = new HashSet<>();
        student s1 = new student("zhangsan", 24);
        student s2 = new student("lisi", 23);
        student s3 = new student("wangwu", 25);
        student s4 = new student("zhaoliu", 24);

        /*System.out.println(lsit.add(s1));
        System.out.println(lsit.add(s2));
        System.out.println(lsit.add(s3));
        System.out.println(lsit.add(s4));
        System.out.println(lsit);*/

        //创建treeset
        TreeSet<student> list = new TreeSet<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(list);


    }
}
