package com.day23;

import java.io.*;

public class 序列化流 {
    /*把java对象写入到本地文件中-----也叫对象操作输出流
     *如果直接写出会爆错
     * 要让javaBean实现Serializable这个接口,但是这个接口里面没有抽象方法(标记型接口)
     * 一旦实现了这个接口,那么就表示当前的类可以被序列化
     *
     * 一旦实现了接口,java就会根据这个类的所有的属性和内容进行计算出一个long类型的序列号
     * 写入本地文件的时候也会记录这个序列号,
     * 如果我们修改了已经实现Serializable接口的类,那么java就会从新的生成一个新的序列号
     * 所以当我们进行反序列化读取本地文件的时候就对比序列号
     * 不一致肯定会爆错呀!
     *注意:序列化写入本地数据是不能修改的,改了就不能反序列化啦!
     *
     * 解决办法:固定版本号   private static final long 版本号=1L
     * private 私有 static 这个类所有的对象都共享  final 不可修改
     *   /*private static  final  long  serialVersionUID=1L;
     * 方式一  */

   /* //方式二 其实还是方一,只不过不用手动设置啦!

    private static final long serialVersionUID = 3987993070122887352L;*/

    public static void main(String[] args) throws IOException {
        //创建对象
        Student stu = new Student("zhangsan", 23, "123456789");

        //创建序列化流的对象
        /*ObjectInputStream ois =new ObjectInputStream(new FileInputStream("e.txt"));*/
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
        oos.writeObject(stu);
        oos.close();
    }
}
