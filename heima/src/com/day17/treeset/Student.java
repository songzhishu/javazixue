package com.day17.treeset;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int yuwen;
    private int shuxue;
    private int yingyu;


    public Student() {
    }

    public Student(String name, int age, int yuwen, int shuxue, int yingyu) {
        this.name = name;
        this.age = age;
        this.yuwen = yuwen;
        this.shuxue = shuxue;
        this.yingyu = yingyu;
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
        this.age = age;
    }

    /**
     * 获取
     *
     * @return yuwen
     */
    public int getYuwen() {
        return yuwen;
    }

    /**
     * 设置
     *
     * @param yuwen
     */
    public void setYuwen(int yuwen) {
        this.yuwen = yuwen;
    }

    /**
     * 获取
     *
     * @return shuxue
     */
    public int getShuxue() {
        return shuxue;
    }

    /**
     * 设置
     *
     * @param shuxue
     */
    public void setShuxue(int shuxue) {
        this.shuxue = shuxue;
    }

    /**
     * 获取
     *
     * @return yingyu
     */
    public int getYingyu() {
        return yingyu;
    }

    /**
     * 设置
     *
     * @param yingyu
     */
    public void setYingyu(int yingyu) {
        this.yingyu = yingyu;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", yuwen = " + yuwen + ", shuxue = " + shuxue + ", yingyu = " + yingyu + "}";
    }

    @Override
    public int compareTo(Student o) {
        int sum = this.getYuwen() + this.getShuxue() + this.getYingyu();
        int sum2 = o.getYuwen() + o.getShuxue() + o.getYingyu();
        int i = sum - sum2;
        //如果总分一样看语文成绩
        i = i == 0 ? this.getYuwen() - o.getYuwen() : i;
        //判断语文成绩是不是一样
        //一样看的话 数学成绩是不是一样,不一样的话还是看语文成绩
        i = i == 0 ? this.getShuxue() - o.getShuxue() : i;
        //判断数学成绩是不是一样 按用英语
        i = i == 0 ? this.getYingyu() - o.getYingyu() : i;
        //所有都一样按年龄
        i = i == 0 ? this.getAge() - o.getAge() : i;
        //年龄都一样 按名字首字母
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
