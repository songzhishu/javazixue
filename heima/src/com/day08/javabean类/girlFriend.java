package com.day08.javabean类;

public class girlFriend {
    //将女朋友的属性隐藏
    public String name;
    private int age;
    private double height;

    //输入年龄
    public void setAge(int a) {
        if (18 < a && a < 40) {
            age = a;
        } else {
            System.out.println("你想干啥!");
        }
    }

    //输出年龄
    public int getAge() {
        return age;
    }

    //输入身高
    public void setHeight(double a) {
        if (1.5 < a && a < 1.8) {

            height = a;

        } else {
            System.out.println("你想干啥!");
        }
    }

    //输出身高
    public double getHeight() {
        return height;
    }

    //方法
    public void sleep() {
        System.out.println("她在睡觉!");

    }

    private void havingDinner() {
        System.out.println("她在吃饭!");
    }
}
