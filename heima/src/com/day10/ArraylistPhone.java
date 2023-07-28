package com.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistPhone {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Phone> list = new ArrayList<>();

        //存入数据
        //手动录入  用这个list.size()不执行for循环
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //创建用户对象
            Phone phone = new Phone();
            System.out.println("输入第" + (i + 1) + "个手机的品牌:");
            String phonebrand = sr.next();
            System.out.println("输入第" + (i + 1) + "个手机的价格:");
            double phoneprice = sr.nextDouble();
            System.out.println("输入第" + (i + 1) + "个手机的颜色:");
            String phonecolor = sr.next();

            //调用set函数存储
            phone.setBrand(phonebrand);
            phone.setPrice(phoneprice);
            phone.setColor(phonecolor);

            //添加到集合
            list.add(phone);
        }
        System.out.println(tofind(list));
        ;//直接打印的话是数据的存储地址
    }

    //筛选
    public static ArrayList<Phone> tofind(ArrayList<Phone> list) {
        //要想返回多个数据,我们可以定义一个容器去存储这些符合条件的数据
        ArrayList<Phone> result = new ArrayList<>();


        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //比较价格
            if (list.get(i).getPrice() <= 3000) {
                result.add(list.get(i));
                //System.out.println(list.get(i).getBrand()+list.get(i).getPrice()+list.get(i).getColor());
            }
        }
        return result;

    }
}
