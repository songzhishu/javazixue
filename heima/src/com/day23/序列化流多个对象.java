package com.day23;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 序列化流多个对象 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象
        Teacher t1=new Teacher("张三","123",23,"南京");
        Teacher t2=new Teacher("李四","456",24,"北京");
        Teacher t3=new Teacher("王五","789",25,"上海");
        Teacher t4=new Teacher("孙六","101112",26,"江苏");

        //关联本地文件
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("g.md"));

        //一个一个太麻烦了叭 存入集合一下子写入
        //创建集合
        ArrayList<Teacher> list=new ArrayList<>();
        Collections.addAll(list,t1,t2,t3,t4);
        //直接写入数组
        oos.writeObject(list);

        /*//写入
        oos.writeObject(t1);
        oos.writeObject(t2);
        oos.writeObject(t3);
        oos.writeObject(t4);*/

        //关流
        oos.close();


        //反序列化
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("g.md"));
        //读,这时候也 不一个一个的读啦,直接读集合就可以
        ArrayList<Teacher> list1 = (ArrayList<Teacher>) ois.readObject();

        for (Teacher teacher : list1) {
            System.out.println(teacher);
        }
        ois.close();

    }
}
