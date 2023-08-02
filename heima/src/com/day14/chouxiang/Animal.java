package com.day14.chouxiang;

public abstract class Animal {
    private String name;
    private int age;

    //抽象方法
    public abstract void eat();
    //构造方法

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void drink() {
        System.out.println("喝水");
    }
}
