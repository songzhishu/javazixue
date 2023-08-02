package com.day14.chouxiang;

public class Frog extends Animal {
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子!");
    }
    //构造方法

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}
