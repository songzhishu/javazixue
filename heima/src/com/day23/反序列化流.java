package com.day23;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 反序列化流 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //读取本地的OBject对象
        //读
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
        Object o = ois.readObject();
        System.out.println(o);
    }

}
