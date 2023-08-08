package com.day17;

import java.util.ArrayList;
import java.util.Collection;

public class collection_test {
    public static void main(String[] args) {
        //add(E e)                        添加
        //clear()                         清空
        //remove(E e)                     删除
        //contains(Object obj)            判断是否包含某个对象
        //isEmpty()                       判断集合是否为空
        //size()                          获取集合的长度
        /*由于collection是一个接口,我们不能直接创建其对象
         * 只能创建他的实现类的对象*/

        //多态
        Collection<String> coll = new ArrayList<>();

        //添加
        coll.add("你好1");
        coll.add("你好2");
        System.out.println(coll.add("你好2"));
        //添加重复的数据是如果添加成功返回true,如果不成功返回flase,我们是list集合支持数据重复的
        coll.add("你好3");
        coll.add("你好4");

        /*System.out.println(coll.size());
        System.out.println(coll);
        //清空
        coll.clear();*/

        //删除
        /*只能通过对象去删除,不能通过数据的索引,*/
        System.out.println(coll.remove("你好2"));
        System.out.println(coll);

        //判断当前元素是否包含------是以equals来判断的,如果没有重写方法的话,他是默认使用object类里面的方法,
        //object类中的equals是判断的地址值而不是属性值,所以当我们存入的是自定对象的时候要重写方法
        System.out.println(coll.contains("你好5"));//不存在---false
        System.out.println(coll.contains("你好4"));


        //判断空
        System.out.println(coll.isEmpty());
    }
}
