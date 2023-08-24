package com.day26.保存信息;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        //创建对象
        Student s=new Student("张三",23,'男',1.85,"吃屎!");
        Teacher t=new Teacher("李四",10000);
        saveObject(t);

    }

    private static void saveObject(Object obj) throws IllegalAccessException, IOException {
        //获取字节码
        Class<?> kk = obj.getClass();

        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\JAVA\\我的项目\\javazixue\\heima\\src\\com\\day26\\保存信息\\信息.txt",true));

        //获取所有的成员变量
        Field[] fields = kk.getDeclaredFields();
        //遍历
        for (Field field : fields) {
            //取消权限
            field.setAccessible(true);
            //获取名字
            String name = field.getName();
            //获取值
            Object value = field.get(obj);

            //写入数据到本地文件
            bw.write(name+"="+value);
            bw.newLine();//换行

        }
        bw.close();
    }
}
