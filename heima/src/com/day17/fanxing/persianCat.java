package com.day17.fanxing;

public class persianCat extends cat {
    public persianCat() {
    }

    public persianCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + this.getAge() + "吃小鱼干!");
    }
}
