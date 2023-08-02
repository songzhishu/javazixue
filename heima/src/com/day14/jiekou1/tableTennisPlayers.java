package com.day14.jiekou1;

public class tableTennisPlayers extends athlete implements speak {
    public tableTennisPlayers() {
    }

    public tableTennisPlayers(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员学打乒乓球!");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语!");
    }
}
