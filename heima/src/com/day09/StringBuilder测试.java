package com.day09;

public class StringBuilder测试 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();

        //查看容量
        System.out.println(sb.capacity());

        //链式编程,就是我们在调用一个方法的时候,不需要用变量去接收他的结果,直接可以调用其他的方法
        //添加元素
        /*sb.append("aaa");
        sb.append('大');
        sb.append(23);
        sb.append(true);*/

        sb.append(223).append('小').append("123141").append(true).reverse().length();
        System.out.println(sb);
        //反转
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());

        sb.append("1214242353465454");

        //上面的都是将StringBuilder作为一个容器,sb不是一个字符串
        //将其变为String类型---->toString();
        //查看容量
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        String str = sb.toString();
        System.out.println(str);


    }
}
