package com.day09;

import java.util.Scanner;

public class 敏感词汇屏蔽 {
    public static void main(String[] args) {
        //输入敏感词汇
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你的垃圾话:");

        String talk = sr.next();

        //定义一个敏感词库
        String[] lajihua = {"sb", "cnm", "mlgb", "傻逼玩意", "吃屎去吧", "下头"};

        //替换
        for (int i = 0; i < lajihua.length; i++) {
            talk = talk.replace(lajihua[i], "你真棒!");
            System.out.println(talk.replace(lajihua[i], "你真棒!"));
        }

        //这里替换是将所有的字符串都遍历一下,如果有与敏感词库中的数据一样的话,他就会替换,而且是一直遍历到最后
        //直到第一个敏感词换完以后再开始第二个敏感词

    }

}
