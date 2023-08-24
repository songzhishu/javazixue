package com.day26.CreateInCombinationWithConfigurationFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1读取配置文件的信息
        Properties prop=new Properties();
        //io流读取
        FileInputStream fis=new FileInputStream("D:\\JAVA\\我的项目\\javazixue\\heima\\src\\prop.properties");

        prop.load(fis);
        fis.close();
        System.out.println(prop);

        //获取全类名
        String classname = (String) prop.get("classname");
        String method = (String) prop.get("method");

        //利用反射创建对象
        Class<?> kk = Class.forName(classname);


        //获取构造方法
        Constructor<?> con = kk.getDeclaredConstructor();
        //根据构造方法去创建duixiang
        Object o = con.newInstance();
        System.out.println(o);


        //获取成员方法并运行
        Method method1 = kk.getDeclaredMethod(method);
        method1.setAccessible(true);//忽略临时权限
        method1.invoke(o);


    }
}
