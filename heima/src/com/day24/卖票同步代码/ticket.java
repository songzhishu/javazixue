package com.day24.卖票同步代码;

public class ticket extends Thread {
    //定义起始票
    static int ticket = 0;
    static Object obj = new Object();//要保证锁对象是唯一的,用static静态关键字就可以

    //加上一个静态关键字,就会使这个类所有的对象共享这个数据,
    @Override
    public  void run() {
        while (true) {
            synchronized ("aaaa") {
                if (ticket < 100) {
                    ticket++;
                    System.out.println(getName() + "在买第" + ticket + "票");
                } else {
                    break;
                }
            }
            /*try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}
