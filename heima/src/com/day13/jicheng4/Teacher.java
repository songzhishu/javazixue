package com.day13.jicheng4;

public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("老师在讲课!");
    }
}
