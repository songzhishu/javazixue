package com.day14.jiekou1;

public abstract class coach extends Person {
    public coach() {
    }

    public coach(String name, int age) {
        super(name, age);
    }

    //抽象方法
    public abstract void teach();
}
