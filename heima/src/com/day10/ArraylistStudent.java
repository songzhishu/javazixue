package com.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistStudent {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> list = new ArrayList<>();

        //集合可长可短,在一开始创建的时候他的长度为零list.size()=0

        //手动录入  用这个list.size()不执行for循环
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            //创建学生对象
            Student stu = new Student();
            System.out.println("输入第" + (i + 1) + "个学生的姓名:");
            String stuname = sr.next();
            System.out.println("输入第" + (i + 1) + "个学生的姓名:");
            int stuage = sr.nextInt();

            //调用set函数存储
            stu.setName(stuname);
            stu.setAge(stuage);

            //添加到集合
            list.add(stu);

        }

        /*//创建学生对象
        Student st1=new Student("张三",17);
        Student st2=new Student("李四",18);
        Student st3=new Student("王五",19);
        //添加到集合
        list.add(st1);
        list.add(st2);
        list.add(st3);*/

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + list.get(i).getAge());
        }
    }
}
