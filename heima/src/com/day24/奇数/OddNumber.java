package com.day24.奇数;

public class OddNumber extends Thread {
    @Override
    public void run() {
        while(true){
            synchronized (OddNumber.class){
                for (int i = 1; i <=100; i++) {
                    if (i%2!=0){
                        System.out.println(getName()+i);
                    }
                }
                break;
            }
        }
    }
}
