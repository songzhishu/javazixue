package com.day24.抢红包;

public class test {
    public static void main(String[] args) {
        //创建进程
        RedEnvelope t1=new RedEnvelope("张三");
        RedEnvelope t2=new RedEnvelope("李四");
        RedEnvelope t3=new RedEnvelope("王五");
        RedEnvelope t4=new RedEnvelope("赵六");
        RedEnvelope t5=new RedEnvelope("孙七");

        //启动
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();



    }
}
