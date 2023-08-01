package com.day13.jicheng6;

public class test {
    public static void main(String[] args) {
        //创建对象
        Cat c = new Cat(2, "红色", "小花猫");
        Dog d = new Dog(3, "白色", "小黑狗");
        Person person = new Person();
        String mao = "小鱼干";
        String gou = "骨头";
        person.keeppet(d, gou);
        person.keeppet(c, mao);
    }
}
