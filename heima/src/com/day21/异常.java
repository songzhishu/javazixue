package com.day21;

public class 异常 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

       /* //如果
        System.out.println(arr[10]);
        System.out.println("看看我执行了没!");
        *//*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 9
         * 报错了说数组的索引越界  然后后面的代码就不会执行*//*
         */

        /*//然后
        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);

        } catch (ArrayIndexOutOfBoundsException  | ArithmeticException e) {
            System.out.println("索引越界!");
        } catch (Exception e) {

        }
        System.out.println("看看我执行了没!");*/

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());


            System.out.println(e.toString());


            e.printStackTrace();//最全面,只是打印异常的信息,不会停止虚拟机(红色信息哦)
        }
        System.out.println("看我执行啦没");
    }
}
