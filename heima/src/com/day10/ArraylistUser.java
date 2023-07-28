package com.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistUser {
    public static void main(String[] args) {

        //创建集合
        ArrayList<Users> list = new ArrayList<>();

        //存入数据
        //手动录入  用这个list.size()不执行for循环
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //创建用户对象
            Users user = new Users();
            System.out.println("输入第" + (i + 1) + "个用户的姓名:");
            String username = sr.next();
            System.out.println("输入第" + (i + 1) + "个用户的id:");
            int userid = sr.nextInt();
            System.out.println("输入第" + (i + 1) + "个用户的password:");
            String userpassword = sr.next();

            //调用set函数存储
            user.setUsername(username);
            user.setId(userid);
            user.setPassword(userpassword);


            //添加到集合
            list.add(user);


        }
        //调用查找函数
        System.out.println(getID(list));
    }

    public static boolean getID(ArrayList<Users> list) {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你要查找的id:");
        int id = sr.nextInt();
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}
