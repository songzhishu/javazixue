package com.day24.奇数;

import static java.lang.Thread.*;

public class OddNumber extends Thread {
    static int number=1;
    @Override
    public void run() {
        while(true){
            synchronized (OddNumber.class){
                number++;
                if (number<=100) {
                    if (number%2!=0){
                        System.out.println(getName()+" "+number);

                    }
                }else {
                    break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
