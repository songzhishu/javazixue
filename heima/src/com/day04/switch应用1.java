package com.day04;

import java.util.Scanner;
/*某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，
到期凭存单支取本息。存款年利率表如下：

        存期		年利率（%）

        一年		2.25

        两年		2.7

        三年		3.25

        五年		3.6
请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。*/

public class switch应用1 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("输入你要存的钱数:");
        int money = sr.nextInt();
        int save_money;

        System.out.print("输入你要存的年数:");
        int year = sr.nextInt();
        if(money>1000){
            switch (year){
                case 1:
                    save_money= (int) (money+money*0.0225);
                    System.out.println("你一年后的存款:"+save_money);
                    break;
                case 2:
                    save_money= (int) (money+money*0.027);
                    System.out.println("你二年后的存款:"+save_money);
                    break;
                case 3:
                    save_money= (int) (money+money*0.0325);
                    System.out.println("你三年后的存款:"+save_money);
                    break;
                case 4:
                    save_money= (int) (money+money*0.036);
                    System.out.println("你四年后的存款:"+save_money);
                    break;
                default:
                    System.out.println("你到底要存多少年呀!");
            }
        }else{
            System.out.println("不好意思,你存款太少,不能提供服务!");
        }

    }
}
