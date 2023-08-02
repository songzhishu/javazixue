package com.day14.chouxiang;

public class test {
    public static void main(String[] args) {
        //创建对象
        Dog d = new Dog("狗", 1);
        d.eat();
        d.drink();
        System.out.println("-----------------------");
        Frog f = new Frog("青蛙", 2);
        f.eat();
        f.drink();
        System.out.println("-----------------------");
        sheep s = new sheep("山羊", 3);
        s.eat();
        s.drink();
    }
}
