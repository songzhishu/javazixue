package com.day13.jicheng2;

public class test {
    public static void main(String[] args) {
        //创建对象
        hashiqi h = new hashiqi();
        h.name = "哈士奇";
        h.eat();
        h.drink();
        h.lookhome();
        h.chaijia();
        System.out.println("----------------------------------");
        shapigou s = new shapigou();
        s.name = "沙皮狗";
        s.eat();
        s.drink();
        s.lookhome();
        System.out.println("----------------------------------");
        chineseRuralDog c = new chineseRuralDog();
        c.name = "中华田园犬";
        c.eat();
        c.drink();
        c.lookhome();

    }
}
