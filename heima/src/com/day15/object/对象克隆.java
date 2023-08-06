package com.day15.object;


public class 对象克隆 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建对象
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User user = new User(1, "zhansan", "123", "girl11", data);

        //克隆对象
        User user2 = (User) user.clone();
        System.out.println(user);
        System.out.println(user2);
        /*克隆分为浅克隆和深克隆
         * 浅克隆是指,不管对象内部的属性是什么类型的数据,全部拷贝过来
         * 深克隆是指,如果是基本数据类型,会直接拷贝,但是如果是字符串的话会看看串池(常量池里面有没有)有的话直接复用,没有在在创建
         * 其他的引用数据类型会重新创建新的*/

        //验证object中的克隆为浅克隆
        int[] arr = user.getData();
        arr[0] = 100;
        System.out.println(user);
        System.out.println(user2);
        //如果是浅克隆两个数据应该是一样的,但是如果是深克隆的话两个数据应该是不一样的


    }
}
