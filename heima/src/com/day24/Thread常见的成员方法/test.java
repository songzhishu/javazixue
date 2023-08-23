package com.day24.Thread常见的成员方法;

public class test {
    public static void main(String[] args) {

        //创键类的对象--要执行的程序
        runnable rb=new runnable();

        //线程对象
        Thread t1=new Thread(rb,"飞机");
        Thread t2=new Thread(rb,"坦克");

        /*//查看默认优先级
        System.out.println(t1.getPriority());//5
        System.out.println(t2.getPriority());//5
        */

        /*抢占式调度--就是多个线程抢夺淳朴的执行权
        * 非抢占式调度--每一个线程交替进行
        * JAVA就是抢占式线程，优先级默认是5，优先级是从1~10*/

        //设置优先级
        t1.setPriority(10);
        t2.setPriority(1);

        System.out.println(t1.getPriority());//5
        System.out.println(t2.getPriority());//5

        t2.start();
        t1.start();


    }
}
