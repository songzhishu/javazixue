package com.day24.等待唤醒机制消费者生产者;


public class Desk  {
    //食物是否存在,0不存在 1存在
    public static int food=1;
    //总个数
    public static int count=0;
    //锁对象
    public static Object lock=new Object();


}
