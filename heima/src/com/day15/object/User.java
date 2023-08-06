package com.day15.object;

import java.util.Arrays;

public class User implements Cloneable {
    //Cloneable是一个空接口里面没有抽象方法,只是一个标记
    private int id;
    private String username;
    private String password;
    private String path;

    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", path='" + path + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类的clone方法

        //怎么改成深克隆
        //创建新数组
        int[] newdata = new int[data.length];
        //拷贝
        for (int i = 0; i < data.length; i++) {
            newdata[i] = data[i];
        }
        //调用父类的方法
        User clone = (User) super.clone();
        //因为父类是浅克隆,所以要替换克隆出来的数组的地址
        clone.data = newdata;
        return clone;
    }
}
