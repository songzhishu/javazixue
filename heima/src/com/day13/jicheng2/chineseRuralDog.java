package com.day13.jicheng2;

public class chineseRuralDog extends Dog {
    String name;

    @Override
    public void eat() {
        System.out.println(this.name + "吃剩饭!");
    }
}
