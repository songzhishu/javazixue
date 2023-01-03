package com.day07;

import java.util.Random;

public class 开发验证码 {
    public static void main(String[] args) {
        char[] cc = verificationCode();
        System.out.print("生成的验证码是:");
        System.out.print("[");
        for (int i = 0; i < cc.length; i++) {

            System.out.print(" " + cc[i] + " ");
        }
        System.out.print("]");

    }

    public static char[] verificationCode() {
        char arrAa[] = new char[52];
        for (int i = 0; i < arrAa.length; i++) {
            //添加小写字母
            if (i <= 25) {
                arrAa[i] = (char) (97 + i);
            }
            //添加大写字母
            else {
                arrAa[i] = (char) (39 + i);
            }
        }
        char code[] = new char[5];
        //随机抽取字母
        Random sc = new Random();
        for (int i = 0; i < code.length - 1; i++) {
            int index = sc.nextInt(0, 52);
            code[i] = arrAa[index];
        }
        //定义数字数组
        char arr1[] = new char[9];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (char) (48 + i);
        }
        //随机抽取数字
        Random sc1 = new Random();
        int index = sc.nextInt(0, 9);
        code[4] = arr1[index];
        return code;
    }
    /*小结:redam随机函数,当给seed和不给seed
     * 是有区别的,大概意思是他给种子的话,再次调用random函数的时候也用了相同的种子时
     * 两次随机生成的数据是一样的
     * 而不给seed的话,产生的数据是有系统随机产生的,很大概率不会重复*/

}
