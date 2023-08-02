package com.day14.jiekou1;

public abstract class athlete extends Person {
    public athlete() {
    }

    public athlete(String name, int age) {
        super(name, age);
    }

    //抽象方法
    public abstract void learn();
}
