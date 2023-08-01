package com.day13.jicheng3;

public class staff {
    private String id;
    private String name;
    private double wages;

    //空参
    public staff() {
    }

    //有参
    public staff(String id, String name, double wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    //方法1
    public void eat() {
        System.out.println("吃米饭！");
    }

    //方法2
    public void work() {
        System.out.println("工作");
    }
}
