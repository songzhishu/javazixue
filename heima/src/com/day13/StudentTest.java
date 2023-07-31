package com.day13;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        /*//创建对象
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(20);
        stu.setGender("男");
        //stu.lsname="艾薇";
        Student.lsname = "艾薇";
        stu.toshow();
        stu.study();


        Student stu1 = new Student();
        stu1.setName("李四");
        stu1.setAge(23);
        stu1.setGender("女");
        stu1.toshow();
        stu1.study();

        //打印出来第一个学生的老师是有名字的,但是第二个学生的老师是null
        //因为他是公共属性,但是只给他一个人赋值导致没有赋值的是null

        //加上static后,在运行就会发现stu2也可以输出

        *//*赋值的方式有两种
         * 1 stu.lsname="艾薇" ---->用创建的对象去赋值;
         * 2 Student.lsname = "艾薇"---->通过类名去赋值*/

        //创建存储对象的集合、
        ArrayList<Student> list = new ArrayList<>();

        //创建学生对象
        Student stu1 = new Student("张三", "男", 24);
        Student stu2 = new Student("李四", "女", 20);
        Student stu3 = new Student("王五", "男", 26);

        //存入集合
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //调用
        System.out.println("最大值:" + maxageutil.maxage(list));
    }


}
