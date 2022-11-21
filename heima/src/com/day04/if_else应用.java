package com.day04;

import java.util.Scanner;
/*某商场购物可以打折，具体规则如下：

       	普通顾客购不满100元不打折，满100元打9折；

        会员购物不满200元打8折，满200元打7.5折；

     	不同打折规则不累加计算。

        请根据此优惠计划进行购物结算，键盘录入顾客的类别
        （0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）*/
public class if_else应用 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("输入你的会员等级:");
        int Grade= sr.nextInt();
        System.out.print("输入你的消费金额:");
        double money= sr.nextDouble();
        if(Grade==0){
            if(money<100){
                System.out.println("不好意思不打折!您要付:"+money);
            } else if (money>100){
                System.out.println("满100打九折!您实付:"+money*0.9);
            }
        }
        else if (Grade==1){
            if(money<200){
                System.out.println("你是会员不满200给您打八折!您要付:"+money*0.8);
            } else if (money>200){
                System.out.println("满200打7.5折!您实付:"+money*0.75);
            }
        }
    }
}
