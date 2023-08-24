package com.day26.利用反射去获取构造方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 利用反射去获取构造方法 {
    //getConstructors()---返回所有的公共的构造方法对象数组
    //getDeclaredConstructors()---返回所有的构造方法对象数组
    //getConstructor()------返回单个公共的构造方法对象
    //getDeclaredConstructor()----返回单个构造方法对象
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> classz = Class.forName("com.day26.利用反射去获取构造方法.Student");



        //1
        //Constructor<?>[] cons = classz.getConstructors();
        /*for (Constructor<?> con : cons) {
            System.out.println(con);
        }*/




        //2
        //Constructor<?>[] cons = classz.getDeclaredConstructors();
        /*for (Constructor<?> con : cons) {
            System.out.println(con);
        }*/



        //3
        Constructor<?> a1 = classz.getConstructor();
        //System.out.println(a1);
        Constructor<?> a2 = classz.getConstructor(String.class);
        //System.out.println(a2);
        Constructor<?> a3 = classz.getDeclaredConstructor(int.class);
        //System.out.println(a3);
        Constructor<?> a4 = classz.getDeclaredConstructor(String.class, int.class);
        //System.out.println(a4);

        //获取构造方法里面的具体数据
        int modifiers = a4.getModifiers();//权限修饰符
        System.out.println(modifiers);//2--代表什么 private

        //创建对象---直接创建的时候是不可以的,有权限修饰符在所以要暂时取消权限的校验
        a4.setAccessible(true);//暂时的---暴力反射
        Student stu =(Student) a4.newInstance("张三", 23);
        System.out.println(stu);


    }
}
