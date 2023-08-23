package com.day24.Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ticket extends Thread {
    //定义起始票
    static int ticket = 0;
    //Lock锁
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //手动加锁
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {

                    ticket++;
                    System.out.println(getName() + "在买第" + ticket + "票");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

            /*try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}
