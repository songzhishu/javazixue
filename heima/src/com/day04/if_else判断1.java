package com.day04;

/*李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手机专卖店推出以旧换新的优惠，
把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出*/
public class if_else判断1 {
    public static void main(String[] args) {
        int second_hand = 1500;
        int original_price = 7899;
        int discount = (int) (original_price * 0.8);//强制转换
        if (second_hand > discount) {
            System.out.println("快去卖二手");
        } else {
            System.out.println("以旧换新");
        }
    }
}
