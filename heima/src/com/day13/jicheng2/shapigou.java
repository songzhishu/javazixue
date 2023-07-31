package com.day13.jicheng2;

public class shapigou extends Dog {
    String name;

    @Override
    public void eat() {
        System.out.println(this.name + "吃狗粮!吃骨头!");
    }
}
