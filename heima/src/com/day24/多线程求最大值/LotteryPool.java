package com.day24.多线程求最大值;

import java.util.ArrayList;
import java.util.Collections;

public class LotteryPool extends Thread {
    ArrayList<Integer> list;

    public LotteryPool(ArrayList<Integer> list) {
        this.list = list;
    }

    static ArrayList<Integer> list1=new ArrayList<>();
    static ArrayList<Integer> list2=new ArrayList<>();

    @Override
    public void run() {
        while (true){
            synchronized (LotteryPool.class){
                if(list.size()==0){
                    //奖抽完了
                    if (getName().equals("奖池1")){
                        //处理数据
                        int sum1=0;
                        int max=0;
                        for (Integer integer : list1) {
                            sum1=integer+sum1;
                        }
                        //最大值
                        for (int i = 0; i < list1.size(); i++) {
                            if(max<list1.get(i)){
                                max=list1.get(i);
                            }
                        }
                        System.out.println("奖池1"+list1+"最大值:"+max+"总和!"+sum1);
                    }else {
                        //处理数据
                        int sum2=0;
                        int max1=0;
                        for (Integer integer : list2) {
                            sum2=integer+sum2;
                        }
                        //最大值
                        for (int i = 0; i < list2.size(); i++) {
                            if(max1<list2.get(i)){
                                max1=list2.get(i);
                            }
                        }

                        System.out.println("奖池2"+list2+"最大值:"+max1+"总和!"+sum2);
                    }

                    break;
                }else {
                    //没有抽完---打乱集合
                    Collections.shuffle(list);
                    Integer remove = list.remove(0);
                    if (getName().equals("奖池1")){
                        list1.add(remove);
                    }else {
                        list2.add(remove);
                    }
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
