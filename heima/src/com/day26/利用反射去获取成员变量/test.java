package com.day26.利用反射去获取成员变量;

import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //getFields()  ---返回所有的公共成员变量对象的数组
        //getDeclareFields()---返回所有成员变量对象的数组
        //getField()------返回单个公共成员变量对象
        //getDeclareField()----返回单个成员变量对象

        //获取以后可以进行赋值和获取值
        Class<?> kk = Class.forName("com.day26.利用反射去获取成员变量.Student");

        
        //1
        /*Field[] fields = kk.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/
        
        //2
        /*Field[] fields = kk.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/
        
        //3
        Field gender = kk.getField("gender");
        System.out.println(gender);

        //4
        Field age = kk.getDeclaredField("age");
        System.out.println(age);

        //权限修饰符
        int modifiers1 = gender.getModifiers();
        System.out.println(modifiers1);
        int modifiers = age.getModifiers();
        System.out.println(modifiers);

        //获取成员变量名
        String name = age.getName();
        System.out.println(name);

        //获取数据类型
        Class<?> type = age.getType();
        System.out.println(type);

        //获取值
        Student s=new Student("张三",23,"男");

        //不能直接访问私有的--临时忽略权限修饰符
        age.setAccessible(true);
        Object o = age.get(s);
        System.out.println(o);

        //修改值
        age.set(s,25);
        System.out.println(s);
    }
}
