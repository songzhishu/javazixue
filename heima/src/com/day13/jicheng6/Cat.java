package com.day13.jicheng6;

public class Cat extends Animal {
    public void catchmouse() {
        System.out.println("抓老鼠!");
    }

    public Cat() {
    }

    public Cat(int age, String color, String name) {
        super(age, color, name);
    }
}
