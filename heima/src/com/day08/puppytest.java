package com.day08;

public class puppytest {
    public static void main(String[] args) {
        puppy dog = new puppy();

        //赋值
        dog.setAge(-18);
        dog.setName("张三");
        dog.setWeight(222);
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getWeight());
    }
}
