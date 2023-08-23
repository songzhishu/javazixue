package com.day24.等待唤醒机制消费者生产者;

public class Consumer extends Thread {
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if (Desk.count==10){
                    break;
                }else {
                    //看桌子上有没有面条
                    if (Desk.food==1){
                        //有 吃
                        Desk.count++;
                        System.out.println("消费者在吃第"+Desk.count+"碗面条");
                        //唤醒厨师
                        Desk.lock.notifyAll();
                        //修改面条状态
                        Desk.food=0;

                    }else {
                        //没有  等
                        try {
                            Desk.lock.wait();//当前的线程和锁绑定的
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
