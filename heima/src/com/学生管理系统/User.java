package com.学生管理系统;

public class User {
    private String username;
    private String password;
    private String ID;
    private String phonenumber;

    public User() {
    }

    public User(String username, String password, String ID, String phonenumber) {
        this.username = username;
        this.password = password;
        this.ID = ID;
        this.phonenumber = phonenumber;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
