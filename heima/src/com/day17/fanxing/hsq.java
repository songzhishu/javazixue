package com.day17.fanxing;

public class hsq extends dog {
    public hsq() {
    }

    public hsq(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + this.getAge() + "吃骨头");

    }
}
