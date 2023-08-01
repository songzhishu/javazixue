package com.day13.jicheng6;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color, String name) {
        super(age, color, name);
    }

    public void lookhome() {
        System.out.println("看家!");
    }
}
