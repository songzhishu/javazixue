package com.day14.chouxiang;

public class sheep extends Animal {
    @Override
    public void eat() {
        System.out.println("山羊吃草!");
    }

    public sheep(String name, int age) {
        super(name, age);
    }

    public sheep() {
    }
}
