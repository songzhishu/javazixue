package com.day13.jicheng4;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("助教在解答疑问!");
    }
}
