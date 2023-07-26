package com.day09;

import java.util.Scanner;
import java.util.StringJoiner;

public class 罗马数字 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你要转换的数字:");

        StringBuilder sb = new StringBuilder();
        StringJoiner sj = new StringJoiner("--", "[", "]");
        while (true) {
            String str = sr.next();
            if (judje(str)) {
                System.out.println("符合要求!");
                //拼接
                for (int i = 0; i < str.length(); i++) {
                    for (int j = 0; j < 10; j++) {
                        if (str.charAt(i) - 48 == j) {
                            sb.append(conversion(j));
                            sj.add(conversion(j));
                        }
                    }
                }
                System.out.println("StringBuilder拼接后的:" + sb);
                System.out.println("StringJoiner拼接后的:" + sj);

                break;
            } else {
                System.out.println("输入错误!请重新输入!");
            }
        }


    }

    //输入字符的判断
    public static boolean judje(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    // 1-Ⅰ、2-Ⅱ、3-Ⅲ、4-Ⅳ、5-Ⅴ、6-Ⅵ、7-Ⅶ、8-Ⅷ、9-Ⅸ
    public static String conversion(int x) {
        //定义数字库
        String[] luoma = {"*", "I", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};

        //替换
        return luoma[x];
    }

}
