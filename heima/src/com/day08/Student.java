package com.day08;

public class Student {
    private int age;
    private String name;

    //没有参数的方法构造
    public Student() {
        System.out.println("看看我执行了嘛");
    }

    //含全部参数的构造
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
