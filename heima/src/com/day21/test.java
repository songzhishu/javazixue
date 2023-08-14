package com.day21;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //键盘录入
        Scanner sr = new Scanner(System.in);

        //创建女朋友的对象
        girl g = new girl();

        while (true) {
            try {
                //输入信息
                System.out.println("输入姓名:");
                String name = sr.nextLine();
                g.setName(name);

                System.out.println("输入年龄:");
                String sage = sr.nextLine();
                System.out.println(sage);
                g.setAge(Integer.parseInt(sage));
                //如果所有有数据都是正确的跳出循环
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (nameFormatException e) {
                e.printStackTrace();

            } catch (AgeoutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        System.out.println(g);
    }
}
