package com.IO综合练习.登录;

import java.io.*;
import java.util.Scanner;

public class 用户登录2 {
    public static void main(String[] args) throws IOException {
        //读
        //读正确的---对比输入
        BufferedReader br=new BufferedReader(new FileReader("user.txt"));
        String line = br.readLine();
        br.close();

        //切割
        String[] str = line.split("&");
        String username = str[0].split("=")[1];
        String password= str[1].split("=")[1];
        String count= str[2].split("=")[1];
        int num = Integer.parseInt(count);
        System.out.println(num);

        //用户输入
        Scanner sr=new Scanner(System.in);
        while (num<3) {
            System.out.println("输入你的用户名:");
            String name = sr.next();
            System.out.println("请输入你的密码:");
            String strword = sr.next();
            if (username.equals(name)&&password.equals(strword)){
                System.out.println("登陆成功!");
                break;
            }else {
                num++;
                int i = 3 - num;
                if(i!=0){
                    System.out.println("登录失败!还有" + (3 - num)+"次机会");
                }else {
                    System.out.println("账户被锁定！");
                }

                //写人数据
                BufferedWriter bw=new BufferedWriter(new FileWriter("user.txt"));
                bw.write("username="+username+"&password="+password+"&count="+num);
                bw.close();
            }
        }
    }
}
