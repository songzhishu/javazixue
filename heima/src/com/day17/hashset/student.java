package com.day17.hashset;

import java.util.Objects;

public class student implements Comparable<student> {
    private String name;
    private int age;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(student o) {
        //指定排序的规则
        //假设看年龄------>这里按照年龄的升序
        /*this表示当前要添加的元素
         * o表示已在红黑树里面的元素
         * 如果ressult >0 添加的元素是大的存右边
         *            <0  添加的元素是小的在左边
         *            =0  已经存在了舍去*/
        System.out.println("----------------------");
        System.out.println("this:" + this);
        System.out.println("o:" + o);
        int result = this.getAge() - o.getAge();


        return result;
    }
}
