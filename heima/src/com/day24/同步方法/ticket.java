package com.day24.同步方法;

public class ticket implements   Runnable {

    //定义起始票
     int ticket = 0;
     //因为之前创建的是Thread，然后我们要创建多个线程对象，他们要共享一个数据所以要用static关键字去修饰
    //但是现在我们创建的是我们要执行的代码，所以只用创建一次这个对象，就没有必要用static关键字去修饰

    @Override
    public void run() {
        //循环
        //同步代码块
        //判断数据不是到循环结束条件
        while (true){
                if (method()) break;
        }
    }

    private synchronized boolean method() {
        if(ticket==10000){
            return true;
        }else {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+"在出售"+ticket+"张票!");
        }
        return false;
    }
}
