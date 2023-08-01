package com.day13.jicheng3;

public class works extends staff {
    @Override
    public void work() {
        System.out.println("炒菜!");
    }

    //空参构造
    public works() {
    }

    //构造方法
    public works(String id, String name, double wages) {
        super(id, name, wages);
    }

    public void show() {
        eat();
        work();
        this.eat();
        this.work();
        super.eat();
        super.work();
    }
}
