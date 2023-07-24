package com.day08.test;

import com.day08.javabean.GirlFriend;

import java.util.Scanner;

public class GirlfriendTest {
    public static void main(String[] args) {
        //创建存储对象的数组
        GirlFriend[] arr = new GirlFriend[4];

        //输入数据并存储数据
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建女朋友对象
            GirlFriend npy = new GirlFriend();
            //输入入数据
            System.out.print("输入姓名:");
            String npyname = sr.next();
            //存储数据
            npy.setName(npyname);

            System.out.print("输入年龄:");
            int npyage = sr.nextInt();
            npy.setAge(npyage);

            System.out.print("输入身高(m):");
            double npyheight = sr.nextDouble();
            npy.setHeight(npyheight);

            System.out.print("输入体重(kg):");
            double npyweight = sr.nextDouble();
            //存储数据
            npy.setWeight(npyweight);

            //存入数组
            arr[i] = npy;
        }
        System.out.println("输出全部信息:");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            GirlFriend npy = arr[i];
            System.out.println("姓名:" + npy.getName() + "年龄" + npy.getAge() + "  身高:" + npy.getHeight() + "  体重:" + npy.getWeight());

        }
        int sumage = 0;
        double sumheight = 0;
        double sumweight = 0;
        int sumh = 0, sumw = 0;
        double[] npyBMI = new double[4];
        //计算平均值
        for (int i = 0; i < arr.length; i++) {
            GirlFriend npy = arr[i];
            //计算每一个的BMI
            npyBMI[i] = npy.getWeight() / Math.pow(npy.getHeight(), 2);
            sumage = npy.getAge() + sumage;
            sumheight = npy.getHeight() + sumheight;
            sumweight = npy.getWeight() + sumweight;
        }
        //处理平均数
        for (int i = 0; i < arr.length; i++) {
            GirlFriend npy = arr[i];
            if (npy.getHeight() < sumheight / 4) {
                sumh++;
            } else if (npy.getWeight() < sumweight / 4) {
                sumw++;
            }
        }

        System.out.println("平均身高:" + sumheight / 4 + "低于平均身高的:" + sumh + "平均体重:" + sumweight / 4 + "低于平均体重的:" + sumw);
        //输出指数
        System.out.print("BMI指数:");
        for (int i = 0; i < npyBMI.length; i++) {
            System.out.print(" " + npyBMI[i] + ",");
        }

    }
}
