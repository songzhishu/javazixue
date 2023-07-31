package com.day13.jicheng;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Ragdoll ra = new Ragdoll();//布偶猫
        ra.eat();
        ra.drink();
        ra.mouse();


        System.out.println("---------------------");
        //哈士奇
        Husky h = new Husky();
        h.housekeeper();
        h.ChaiJia();
        h.drink();
        h.eat();

        //如果说父类的方法不是public修饰,而是private修饰,那么子类就没有办法访问了
        //如果是私有的成员变量还可以调用父类的非私有的方法去获取

    }
}
