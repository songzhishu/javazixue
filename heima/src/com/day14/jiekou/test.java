package com.day14.jiekou;

public class test {
    public static void main(String[] args) {
        //创建对象
        Frog f = new Frog("青蛙", 2);
        f.eat();
        f.swim();
        System.out.println("---------------------");
        dog d = new dog("狗狗", 2);
        d.eat();
        d.swim();
        System.out.println("---------------------");
        rabbit r = new rabbit("小兔子！", 2);
        r.eat();
    }
}
