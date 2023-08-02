package com.day14.chouxiang;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("小狗吃骨头!");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
