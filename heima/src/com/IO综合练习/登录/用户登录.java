package com.IO综合练习.登录;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class 用户登录 {
    public static void main(String[] args) throws IOException {
        //读正确的---对比输入
        BufferedReader br=new BufferedReader(new FileReader("user.txt"));
        String line = br.readLine();
        br.close();

        //得到数据 切割数据
        String[] str = line.split("&");
        String username = str[0].split("=")[1];
        String password= str[1].split("=")[1];


        //用户输入
        Scanner sr=new Scanner(System.in);
        System.out.println("输入你的用户名:");
        String name = sr.next();
        System.out.println("请输入你的密码:");
        String strword = sr.next();
        if (username.equals(name)&&password.equals(strword)){
            System.out.println("登陆成功!");
        }else {
            System.out.println("登陆失败!");
        }



    }
}
