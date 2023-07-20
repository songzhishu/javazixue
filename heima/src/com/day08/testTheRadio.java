package com.day08;

public class testTheRadio {
    public static void main(String[] args) {
        //创建南孚对象并且赋初值
        Battery nanfu = new Battery(100);
        System.out.println("当前南孚的电量:" + nanfu.ElectricityLevel);
        Radio radio = new Radio();
        System.out.println("收音机使用南孚电池");
        radio.Radio(nanfu);
        System.out.println("现在的电量:" + nanfu.ElectricityLevel);
    }
}
