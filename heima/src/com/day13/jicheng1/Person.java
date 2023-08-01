package com.day13.jicheng1;

public class Person {
    private String nanme;
    private int age;
    private String gender;
    private String nationality;

    public Person() {
    }

    public Person(String nanme, int age, String gender, String nationality) {
        this.nanme = nanme;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    public String getNanme() {
        return nanme;
    }

    public void setNanme(String nanme) {
        this.nanme = nanme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    //成员方法
    public void eat() {
        System.out.println("吃东西!");
    }

    public void sleep() {
        System.out.println("睡觉!");
    }

    public void work() {
        System.out.println("工作!");
    }

}
