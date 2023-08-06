package com.day15.zhengze;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 文本匹配 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        // method1(str);
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher matcher = p.matcher(str);

        //循环读取
        while (matcher.find()) {
            String s = matcher.group();
            System.out.println(s);
        }

    }


    private static void method1(String str) {
        /*Pattern 表示正则表达式
         * Matcher 文本匹配器,作用按照表达式的规则去读取数据,重头开始读取*/

        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");

        Matcher matcher = p.matcher(str);

        //读取
        boolean b = matcher.find();

        //截取
        String s = matcher.group();
        System.out.println(s);
    }
}
