package com.day14.neibulei;

public class outer {
    private int a = 10;
    //外部类的静态成员
    private static int b = 20;

    //静态内部类
    static class inner {
        //非静态内部类方法
        public void show() {
            System.out.println(b);
            //静态内部类里面可以访问外部类的静态成员
            //System.out.println(a);
            //报错!静态内部类不能访问外部类的非静态成员
            /*那么怎么可以访问a呐!创建外部类的对象,然后由对象访问!*/
            outer o = new outer();
            System.out.println(o.a);
            System.out.println("内部类中非静态方法");
        }

        //静态内部类方法
        public static void show2() {
            System.out.println("内部类中静态方法");
        }
    }
}
