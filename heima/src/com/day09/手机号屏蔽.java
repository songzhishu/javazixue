package com.day09;

public class 手机号屏蔽 {
    public static void main(String[] args) {
        //1235464645
        //123****645
        //substring(int startindex,int endindex)指定截取字符串从开始位置到结束位置,
        //substring(int endindex),从指定位置进行截取到末尾
        //包含开始位置不包含起始位置,并且返回截取后的字符串
        String PhoneNumber = "13345686789";
        System.out.println(PhoneNumber.substring(0, 3) + "****" + PhoneNumber.substring(7));

    }
}
