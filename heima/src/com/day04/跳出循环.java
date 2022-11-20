package com.day04;




public class 跳出循环 {
    public static void main(String[] args) {
        //continue可以跳出当前的本次循环
        /*for(int i=1;i<=5;i++) {
            if (i==3){ //当i=3时规定跳出该次循环
                continue;
            }
            System.out.println("第"+i+"循环");
        }*/
        //break 跳出循环语句
        for(int i=1;i<=5;i++) {
            if (i==3){ //当i=3时规定跳出循环体
                break;
            }
            System.out.println("第"+i+"循环");
        }
    }
}