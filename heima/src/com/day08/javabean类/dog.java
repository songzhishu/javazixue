package com.day08.javabean类;

public class dog {
    public String name;
    private int age = 20;

    public void assignment() {
        int age = 10;
        System.out.println(age);
        //输出10是因为就近原则,成员变量age离得比较近
        System.out.println(this.age);
        //加this关键字后就是输出全局变量,这个例子里我们没有对全局变量age
        //赋值,所以他的值是就是默认的0

        /*this关键字就是当全局变量和局部变量重名的情况下使用的,哈哈哈我也不知道
         * 不对的话你就当我胡说*/
    }
}
