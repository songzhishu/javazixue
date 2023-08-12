package com.day17.fanxing;

public class teddy extends dog {
    public teddy() {
    }

    public teddy(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + this.getAge() + "吃屎!");

    }
}
