package com.day03;

public class 算术运算符 {
    public static void main(String[] args) {
        //+
        System.out.println(3+2);
        //有小数参与时有可能是不正确的
        System.out.println(1.1+1.01);
        //准确的
        System.out.println(1.1+1.1);
        //-
        System.out.println(8-2);
        //*
        System.out.println(8*9);
        //除(取整)
        System.out.println(10/2);
        System.out.println(10/3);
        //有小数的时候可能不正确
        System.out.println(10.0/3.0);
        //取余
        System.out.println(10%3);
           /*数据大小排序:byte < short < char < int < long <  float < double
        数据转换分为隐式转换(系统自己处理,把一个取值范围小的转换成取值范围大的数据)
        隐式转换的两个规则:1大和小一起运算,小变大
                       2 byte,short,char在运算时会转换成int
        强制转换(大换小)
            1 格式 目标数据类型 变量名 =(目标数据类型)要转换的变量名
            2 转换后有可能失真       */


          /*当运算时用+出现了字符串 那么这时+就不是算术运算符,而是字符串的连接符
          简单的来讲就是有字符串时是连接符,没有的时候就是运算符
          当出现单个字符的时候再使用+时,会将char转换成int类型进行计算*/
        System.out.println(1+2+"咚哒哒"+2+1);
        System.out.println(66+22+'中'+1);
        System.out.println('你'+'好');
    }
}
