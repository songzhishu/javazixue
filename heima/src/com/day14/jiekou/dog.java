package com.day14.jiekou;

public class dog extends Animal implements swim {
    @Override
    public void eat() {
        System.out.println("狗狗在吃骨头!");
    }

    @Override
    public void swim() {
        System.out.println("小狗在狗刨!");
    }

    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }
}
