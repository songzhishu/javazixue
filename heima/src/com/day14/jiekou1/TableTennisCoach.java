package com.day14.jiekou1;

public class TableTennisCoach extends coach implements speak {
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球!");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练讲英语!");
    }
}
