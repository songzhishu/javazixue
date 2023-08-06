package com.day15.zhengze;

public class test2 {
    public static void main(String[] args) {
        //手机号
        String PhoneNumber = "1[3-9]\\d{9}";
        System.out.println("12345694948".matches(PhoneNumber));

        //坐机号
        String a = "0\\d{2,3}-?[1-9]\\d{4,6}";
        System.out.println("020-2324242".matches(a));
        System.out.println("02122442".matches(a));
        System.out.println("027-23245".matches(a));
        System.out.println("0201-2324242".matches(a));

        //邮箱号
        String b = "\\w+@[\\w+&&[^_]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";

        String c = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("23:24:56".matches(c));

        System.out.println("---------------------------");
        //用户名
        String d = "\\w{4,16}";
        System.out.println("zhsnan".matches(d));
        System.out.println("---------------------------");
        //身份证
        String e = "[1-9]\\d{16}(\\d||X||x)";
        String f = "[1-9]\\d{16}[\\dXx]";
        System.out.println("41282220000603178X".matches(e));
        System.out.println("---------------------------");
        //忽略大小写的方式
        String s = "a(?i)bc";//忽略bc的大小写
        System.out.println("aBc".matches(s));
        System.out.println("---------------------------");
        String s1 = "a((?i)b)c";//只忽略b的大小写
        System.out.println("aBc".matches(s1));
        System.out.println("ABc".matches(s1));
        System.out.println("aBC".matches(s1));
        System.out.println("abC".matches(s1));
        System.out.println("abc".matches(s1));
        System.out.println("---------------------------");
        //改写身份证
        String e2 = "[1-9]\\d{16}(\\d||(?i)x)";
        System.out.println("41282220000603178X".matches(e2));

        ///^[1-9]\d{5}(?:18|19|20)\d{2}(?:0\d|10|11|12)(?:0[1-9]|[1-2]\d|30|31)\d{3}[\dXx]$/
        //身份证号的严格校验
        String e3 = "[1-9]\\d{5}(18||19||20)\\d{2}(0[1-9]||1[0-2])(0[1-9]||[12]\\d||3[01])\\d{3}[\\dXx]";
        System.out.println("41282220000603178X".matches(e3));
    }
}
