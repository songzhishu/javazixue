package com.day04;


public class 逢7避过 {
    public static void main(String[] args) {
        /*Scanner sr= new Scanner(System.in);
        System.out.println("输入开始数：");
        int start= sr.nextInt();
        System.out.println("输入结束数：");
        int end= sr.nextInt();
        System.out.println("输入密码：");
        int mima= sr.nextInt();
        for(int i=start;i<=end;i++){
            if(mima>end){
                System.out.println("密码没法玩呀");
               break;
            }
            if(i%mima==0||)
        }*/
        for (int i=1;i<=100;i++){
            if (i%7==0||i/10%7==7||i%10==7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}