package com.day09;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        //首先存入一个用户数据1
        String rightUsername = "宋之树";
        String rightUserpassword = "123456";


        //比较
        for (int i = 0; i < 3; i++) {

            //输入
            Scanner sr = new Scanner(System.in);
            System.out.print("输入用户名:");
            String username = sr.next();
            System.out.print("输入用户密码:");
            String userpassword = sr.next();

            if (username.equals(rightUsername) && userpassword.equals(rightUserpassword)) {
                System.out.println("欢迎您回来!");
                break;
            } else if (username.equals(rightUsername)) {
                System.out.println("密码错误!你还有" + (2 - i) + "次机会");
            } else if (userpassword.equals(rightUserpassword)) {
                System.out.println("用户名错误!" + (2 - i) + "次机会");
            }
        }


    }
}
