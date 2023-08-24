package com.day24.抢红包;

import java.util.Random;

public class RedEnvelope extends  Thread {


    static double money=100;
    static int count =3;

    static final double min= 0.01;

    public RedEnvelope() {
    }

    public RedEnvelope(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (RedEnvelope.class){
            if(count==0){
                System.out.println("红包抢完了!"+getName()+"你没机会了");
            }else {
                //定义中奖金额
                double prize=0;
                if(count==1){
                    //最后一个红包!剩下的钱都是这个人的
                    prize=money;
                }else {
                    Random r =new Random();
                    //不能把钱都抢完啊!
                    double bound = money - (count - 1) * min;
                    prize = r.nextDouble(bound);
                    //prize<0.01---直接赋值为最小金额
                    if(prize<min){
                        prize=min;

                    }
                }
                //修改金额
                money=money-prize;
                //剩余红包数
                count--;
                System.out.println(getName()+"抢到了"+prize+"元");

            }

        }
    }
}
