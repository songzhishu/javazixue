package com.day08.javabean;

public class GirlFriend {
    //属性
    private String name;
    private double height;
    private Double weight;

    //行为
    public void wash() {
        System.out.println("女朋友在洗衣服");

    }

    public void cook() {
        System.out.println("女朋友在做饭");
    }

    public void show() {
        System.out.println("我女朋友" + name + "身高" + height + "体重" + weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
