package com.day13.jicheng2;

public class hashiqi extends Dog {
    String name;

    @Override
    public void eat() {
        System.out.println(this.name + "吃狗粮!");
    }

    public void chaijia() {
        System.out.println(this.name + "拆家!");
    }

}
