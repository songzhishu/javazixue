package com.day24.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            //不断的将面条放到阻塞队列
            try {
                queue.put("面条");
                System.out.println(getName()+"放了一碗面条！");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
