package com.day17.fanxing;

public class dragonLi extends cat {
    public dragonLi() {
    }

    public dragonLi(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + this.getAge() + "吃小鱼!");
    }
}
