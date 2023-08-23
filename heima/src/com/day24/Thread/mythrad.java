package com.day24.Thread;

public class mythrad extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"你是狗!");
        }
    }
}
