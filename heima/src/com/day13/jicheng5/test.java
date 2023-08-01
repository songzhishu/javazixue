package com.day13.jicheng5;

public class test {
    public static void main(String[] args) {
        //创建对象
        Teacher T = new Teacher("张三", 12, "数学");
        T.publishForm();
        System.out.println("--------------------------------------");
        Student s = new Student("王伟", 1, "一班");
        s.behavior();
    }
}
