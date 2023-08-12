package com.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 方法引用test1 {
    public static void main(String[] args) {
        //存储数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "蔡徐坤,24", "叶星成,23", "鹿哈,25", "刘不甜,22", "吴亦凡,24", "顾宇佳,27",
                "肖振良,26", "赵丽颖,35", "杨颖,36", "高圆圆,46", "张天天,31", "刘诗诗,35", "杨幂,33", "迪丽娜扎,26", "杨过,23");

        //收集到数组
        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(array);//打印的是地址值
        System.out.println(Arrays.toString(array));//打印的是数组


        ArrayList<Student> stulist = new ArrayList<>();
        //添加学生对象
        stulist.add(new Student("zhangsan", 23));
        stulist.add(new Student("lisi", 24));
        stulist.add(new Student("wangwu", 25));

        //收集到数组-------------map转换成string   toarray转换成数组
        String[] array1 = stulist.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array1));

        /* String[] array2 = stulist.stream().map(Student::new).toArray(String[]::new);*/


    }
}
