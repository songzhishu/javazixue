package com.day17;

import java.util.ArrayList;
import java.util.List;

public class List_test {
    public static void main(String[] args) {
        /*1、add（int index，E element）   在指定位置插入指定元素
          2、remove（in index）            删除指定位置的上的元素，返回值是被删除的元素
          3、set（int index，E element）   修改指定位置上的元素，返回被修改的值
          4、get（int index）              返回指定位置上的元素
        * */

        //创建集合
        //list是一个接口,所以不能直接创建其对象所以要用她的实现类来创建对象(多态)
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        //在指定位置上添加元素(索引从零开始!)
        list.add(3, "aaa");
        System.out.println(list);
        //删除指定位置的元素
        System.out.println(list.remove(2));//返回3
        System.out.println(list);

        //修改指定位置的元素
        list.set(2, "3");//返回"aaa"
        System.out.println(list);

        //获取指定位置的元素
        System.out.println(list.get(5));

        //删除上的小细节
        List<Integer> list1 = new ArrayList<>();
        //添加元素
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //现在假如我想删除1
        // list1.remove(1);
        /*问题来啦,我删除的是1索引的位置上的元素还是删除的是1这个元素呐!
         * 答案是删除的是1索引上的元素也就是2
         * 是这样的此时我们list集合里有两种删除的方法
         * 一种是按索引,一种是按元素(方法的重载)
         * 当这种现象出现的时候,就会有一个机制,优先调用,实参和形参类型一致的方法
         * 我们此时传入的1----基本数据类型---int,当然此时会调用按索引的呀,他是int类型
         * 这个现象的结论就是remove不会自动装箱
         * 那么问题由来了,我怎么才能删除1这个元素呐*/


        //这个操作叫做手动封箱,将int转换成integer类型
        Integer i = Integer.valueOf(1);
        list1.remove(i);
        System.out.println(list1);
    }
}
