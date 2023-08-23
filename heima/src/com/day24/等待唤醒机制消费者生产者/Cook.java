package com.day24.等待唤醒机制消费者生产者;

public class Cook extends Thread{

    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count==10){
                    break;
                }else{
                    //判断有没有食物
                    if(Desk.food==1){
                        //有 等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        System.out.println("厨师做饭!");
                        //没有-- 做饭--修改食物的状态
                        Desk.food=1;
                        //唤醒当前锁对象绑定的所有的线程
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
