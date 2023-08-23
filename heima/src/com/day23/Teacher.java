package com.day23;

import java.io.Serial;
import java.io.Serializable;

public class Teacher implements Serializable {

    @Serial
    private static final long serialVersionUID = 3348540217053632741L;
    private String name;
    private  transient String ID;
    private int age;
    private String address;


    public Teacher() {
    }

    public Teacher(String name, String ID, int age, String address) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Teacher{name = " + name + ", ID = " + ID + ", age = " + age + ", address = " + address + "}";
    }
}
