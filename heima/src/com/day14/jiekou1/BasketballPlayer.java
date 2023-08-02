package com.day14.jiekou1;

public class BasketballPlayer extends athlete {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员学打篮球!");
    }
}
