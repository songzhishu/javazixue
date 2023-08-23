package com.day24.买票;

public class ticket extends Thread{
    public ticket() {
    }

    public ticket(String name) {
        super(name);
    }

    static int ticket=0;
    @Override
    public void run() {
        while(true){
            synchronized (ticket.class){

                if (ticket>=900){
                    System.out.println("不好意思！直售票已卖完，剩余票为预留票，不对外出售");
                    break;
                }else {
                    try {
                        ticket++;
                        System.out.println(getName()+"正在买第"+ticket+"张票，剩余"+(1000-ticket)+"张票！");
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
