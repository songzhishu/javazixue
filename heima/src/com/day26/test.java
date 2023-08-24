package com.day26;

public class test {
    public static void main(String[] args) throws ClassNotFoundException {

        //方式1  全类名:包名+类名
        Class<?> aClass = Class.forName("com.day26.Student");
        System.out.println(aClass);

        //方式2 ----当做参数使用
        Class<Student> aClass1 = Student.class;
        System.out.println(aClass1);

        //方式3  已经创建对象可以使用
        Student s =new Student();
        Class<? extends Student> aClass2 = s.getClass();
        System.out.println(aClass2);
    }
}
