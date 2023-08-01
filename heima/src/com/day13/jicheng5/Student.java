package com.day13.jicheng5;

public class Student extends Person {
    private String classname;

    public Student() {

    }

    public Student(String name, int age, String classname) {
        super(name, age);
        this.classname = classname;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public void behavior() {
        System.out.println("填写听课反馈");
    }
}
