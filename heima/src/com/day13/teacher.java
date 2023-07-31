package com.day13;

public class teacher extends person {

    public void show() {
        //1
        eat();
        drank();
        //2
        this.eat();
        this.drank();
        //3
        super.eat();
        super.drank();
        /*首先讲一下1和2：其实1也有this,但是可以省略,他们两个是一样的首先在方法的调用者的类里面去找
        eat和drink这两个方法，但是结果里面没有，然后看到他有一个父类就在去他的父类里面找
        然后3呐，就是直接去方法调用者的父类里面找*/
    }

    @Override//代表重写
    public void eat() {
        System.out.println("老师吃饭！");
    }

    @Override
    public void drank() {
        System.out.println("老师喝水！");
    }

}
