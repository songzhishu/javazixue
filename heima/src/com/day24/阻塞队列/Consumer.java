package com.day24.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer extends  Thread{
    ArrayBlockingQueue<String> queue;

    public Consumer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            //不断从阻塞队列中获取面条
            try {
                String food = queue.take();
                System.out.println(getName()+"拿走一碗面条！");//这句话在锁外面,
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
