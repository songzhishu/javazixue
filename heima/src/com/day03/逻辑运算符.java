package com.day03;

public class 逻辑运算符 {

    public static void main(String[] args) {
        //&就是两个真才真,|就是两个假才假,^异或 相同为假不同为真, !取反也叫非
        System.out.println(true&false);//假
        System.out.println(true&true);//真
        System.out.println(false&false);//假
        System.out.println(true|false);//真
        System.out.println(true|true);//真
        System.out.println(false|false);//假
        System.out.println(true^false);//真
        System.out.println(true^true);//假
        System.out.println(false^false);//假
        System.out.println(!true);//假
        System.out.println(!false);//真
        System.out.println(true&&false);
        //短路运算符 &&和|| 短路就是偷懒,只要左边的可以确定结果就不在判断右边的结果

    }
}
