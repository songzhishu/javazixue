package com.day13.jicheng1;

public class Worker extends Person {
    private String unit;
    private int workage;

    public Worker() {
    }

    public Worker(String nanme, int age, String gender, String nationality, String unit, int workage) {
        super(nanme, age, gender, nationality);
        this.unit = unit;
        this.workage = workage;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkage() {
        return workage;
    }

    public void setWorkage(int workage) {
        this.workage = workage;
    }

    @Override
    public void work() {
        System.out.println("工人的工作就是盖房子!");
    }
}
