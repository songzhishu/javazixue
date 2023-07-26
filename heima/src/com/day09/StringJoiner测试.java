package com.day09;

import java.util.StringJoiner;

public class StringJoiner测试 {
    public static void main(String[] args) {
        /*StringJoiner两种创建方式
         * 1、指定中间的分隔符号
         * StringJoiner("----->")   分隔符----->
         * 2、指定中间分隔符号和起始结束符号
         * StringJoiner("----->","[","]") 分隔符-----> 起始[   结束 ] */

        //创建对象
        StringJoiner sj = new StringJoiner(">>>", "^", "^");

        //添加元素(目前只能添加String类型的)
        sj.add("1").add("2").add("3").add("4").add("5");
        System.out.println(sj);
        System.out.println(sj.length());

        System.out.println(sj.toString());//转换成字符串
    }
}
