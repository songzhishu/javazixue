package com.day24.Callable_Future;

import java.util.concurrent.Callable;

public class mycallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        //1到100求和
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
