package com.day17.treeset;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student("zhangsan", 23, 90, 99, 50);
        Student s2 = new Student("lisi", 24, 90, 98, 50);
        Student s3 = new Student("wangwu", 25, 95, 100, 30);
        Student s4 = new Student("zhaoliu", 26, 60, 99, 70);
        Student s5 = new Student("qianqi", 26, 70, 80, 70);
        //创建集合对象
        TreeSet<Student> list = new TreeSet<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        for (Student student : list) {

            System.out.println(student);
            //数据是错的?
            System.out.println(student.getYingyu() + student.getShuxue() + student.getShuxue());
        }

    }
}
