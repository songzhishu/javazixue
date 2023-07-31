package com.day13;

public class Student {
    //属性
    private String name;
    private String gender;
    private int age;
    //公共的
    //public String lsname;
    public static String lsname;
    //加上static后表示Student的所有的对象都共享同一个lsname

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为
    public void toshow() {
        System.out.println(name + ", " + age + ", " + gender + ", " + lsname);
    }

    public void study() {
        System.out.println(name + "在学习!");
    }
}
