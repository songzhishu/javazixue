package com.day08;

public class puppy {
    private int age;
    private double weight;
    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 50) {
            System.out.println("年龄不合法!");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seelp() {
        System.out.println("她在睡觉!");
    }

    public void eat() {
        System.out.println("他在吃东西!");
    }
}