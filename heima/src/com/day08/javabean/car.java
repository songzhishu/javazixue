package com.day08.javabean;

import java.util.Scanner;

public class car {
    //属性
    private String name;
    private double price;
    private String color;
    //行为(方法)

    public car() {
    }

    public car(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入车的名字:");
        String carname = sr.next();//ctrl+alt+v
        this.name = carname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入车的价格:");
        double carprice = sr.nextDouble();//ctrl+alt+v
        this.price = carprice;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入车的颜色:");
        String carcolor = sr.next();//ctrl+alt+v
        this.color = carcolor;
    }
}
