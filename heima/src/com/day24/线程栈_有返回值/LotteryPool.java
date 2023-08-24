package com.day24.线程栈_有返回值;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class LotteryPool implements Callable<Integer> {
    ArrayList<Integer> list;

    public LotteryPool(ArrayList<Integer> list) {
        this.list = list;
    }



    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxlist = new ArrayList<>();
        while (true) {
            synchronized (LotteryPool.class) {
                if (list.size() == 0) {
                    //处理数据
                    int sum1 = 0;
                    int max = 0;
                    for (Integer integer : boxlist) {
                        sum1 = integer + sum1;
                    }
                    //最大值
                    for (int i = 0; i < boxlist.size(); i++) {
                        if (max < boxlist.get(i)) {
                            max = boxlist.get(i);
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + boxlist + "最大值:" + max + "总和:" + sum1);
                    break;
                } else {
                    //没有抽完---打乱集合
                    Collections.shuffle(list);
                    Integer remove = list.remove(0);
                    boxlist.add(remove);

                }
            }
            Thread.sleep(100);

        }
        //获取集合的最大值返回
        if(boxlist.size()==0){
            return null;
        }else {
            return Collections.max(boxlist);
        }
    }
}
