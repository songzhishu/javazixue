package com.day24.抽奖;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class LotteryPool extends Thread {
    ArrayList<Integer> list;

    public LotteryPool(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (LotteryPool.class){
                if(list.size()==0){
                    //奖抽完了
                    break;
                }else {
                    //没有抽完---打乱集合
                    Collections.shuffle(list);
                    Integer remove = list.remove(0);
                    System.out.println(getName()+"抽中奖"+remove);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
