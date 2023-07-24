package com.day08.test;

import com.day08.javabean.Student;

public class StudentTest {
    public static void main(String[] args) {
        //首先创建存储对象的数组
        Student[] arr = new Student[3];

        //创建对象
        Student stu1 = new Student(1, "zhansan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        /*Student stu4 = new Student(2, "赵六", 26);



        //判断数据是否存
        boolean outcome = judge(arr, stu4.getId());
        if (outcome) {
            System.out.println("id已将存在!");
        } else {
            //判断数组是否存满
            int count = count(arr);
            if (count == arr.length) {
                System.out.println("数组已经满了!");

                Student[] newarr = creatnewarr(arr);
                newarr[count] = stu4;
                //打印
                bianli(newarr);
            } else {
                arr[count] = stu4;
                bianli(arr);
            }
        }

    }

    public static boolean judge(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (stu.getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int count(Student[] arr) {
        //判断数据是否为空
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //满了创建新数组
    public static Student[] creatnewarr(Student[] arr) {
        Student[] newarr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            //老的copy到新的
            newarr[i] = arr[i];
        }
        return newarr;
    }

    //遍历数组

    public static void bianli(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student st = arr[i];
            System.out.println("姓名:  " + st.getName() + "  id  " + st.getId() + "  年龄:  " + st.getAge());
        }
    }*/


    }
}
