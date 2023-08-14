package com.day21;

public class girl {
    private String name;
    private int age;

    public girl() {
    }

    public girl(String name, int age) {

        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        int num = name.length();
        if (num < 2 || num > 5) {
            throw new nameFormatException(name + "格式有误!");
        }
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {

        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        if (age < 18 || age > 40) {
            throw new AgeoutOfBoundsException(age + "格式有误");
        }
        this.age = age;
    }

    public String toString() {
        return "girl{name = " + name + ", age = " + age + "}";
    }
}
