package com.day08.javabean;

public class phone {
    private String brand;
    private double price;
    private String color;

    public void call() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机" + "打电话");
    }

    public void sendAMessage() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机" + "发短信");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
