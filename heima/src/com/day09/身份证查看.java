package com.day09;

public class 身份证查看 {
    public static void main(String[] args) {
        String id = "412822200001071646";

        //获取身份证的数据
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        String gender = id.substring(16, 17);
        System.out.println("个人信息:");
        System.out.println("出生年月:" + year + "年" + month + "月" + day + "日");

        int a = Integer.parseInt(gender);
        if (a % 2 == 0) {
            System.out.println("女");
        } else {
            System.out.println("男");
        }

    }
}
