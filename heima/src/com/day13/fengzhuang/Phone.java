package com.day13.fengzhuang;

public class Phone {
    private String brand;
    public double price;
    //静态变量
    static int greensize;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
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

    public static int getGreensize() {
        return greensize;
    }

    public static void setGreensize(int greensize) {
        Phone.greensize = greensize;
    }

    //行为
    public void call() {
        System.out.println("打电话!");
    }

    public void sendmessage() {
        System.out.println("发短信!");
    }

    public void plaggame() {
        System.out.println("玩游戏!");
    }

}
