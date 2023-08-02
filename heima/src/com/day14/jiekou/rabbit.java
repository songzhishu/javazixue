package com.day14.jiekou;

public class rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜!");
    }

    public rabbit() {
    }

    public rabbit(String name, int age) {
        super(name, age);
    }
}
