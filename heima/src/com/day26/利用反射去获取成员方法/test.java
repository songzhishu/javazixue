package com.day26.利用反射去获取成员方法;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*getMethods()      ---返回所有的公共成员方法对象的数组,包括继承的
        * getDeclaredMethods() ----返回所有成员方法对象的数组,不包括继承的
        * getMethod()  -----返回单个公共成员方法对象
        * getDeclaredMethod() ------返回单个成员方法*/

        Class<?> kk = Class.forName("com.day26.利用反射去获取成员方法.Student");


        //1----继承父类的公共方法和本类的公共方法
        /*Method[] methods = kk.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        //2---没有继承的父类的公共方法,只有本类的所有方法
       /* Method[] methods = kk.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        //3   ---没有参数的(就是在类里面没有重名的)
        Method sleep = kk.getMethod("sleep");
        //System.out.println(sleep);

        //4 --写参数(有重名的)
        Method eat = kk.getDeclaredMethod("eat", String.class, int.class);
        System.out.println(eat);


        //获取权限修饰符
        int modifiers = eat.getModifiers();
        System.out.println(modifiers);//2  pravite

        //获取名字
        String name = eat.getName();
        System.out.println(name);

        //获取形参
        Parameter[] parameters = eat.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //方法抛出的异常
        Class<?>[] exceptionTypes = eat.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        //方法的运行
        Student student=new Student();
        eat.setAccessible(true);
        String o = (String) eat.invoke(student, "汉堡包", 6);//返回值
        System.out.println(o);

    }
}
