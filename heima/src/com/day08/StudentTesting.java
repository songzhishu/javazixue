package com.day08;

public class StudentTesting {
    public static void main(String[] args) {
        /*//创建对象
        Student aa = new Student();
        //我们调用了空参构造但是没有赋值我们输出age和name
        //发现是空值
        System.out.println(aa.getAge()+aa.getName());*/

        //调用 带参数构造
        Student bb = new Student(24, "李四");
        System.out.println(bb.getAge() + bb.getName());
    }
}
