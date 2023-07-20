package com.day08;


public class User {
    private String username, passward, email, gender;
    private int age;

    public User() {
    }

    public User(String username, String passward, String email, String gender, int age) {
        this.username = username;
        this.passward = passward;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return passward
     */
    public String getPassward() {
        return passward;
    }

    /**
     * 设置
     *
     * @param passward
     */
    public void setPassward(String passward) {
        this.passward = passward;
    }

    /**
     * 获取
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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

    public String toString() {
        return "User{username = " + username + ", passward = " + passward + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }

    /*//空参构造方法
    public User(){

    }
    //全部参数
    public User(String username,String passward,String email,String gender,int age){
        this.username=username;
        this.passward=passward;
        this.email=email;
        this.gender=gender;
        this.age=age;

    }
*//*    //get和set方法
    public void setUsername(String username){
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassward(String passward){
        this.passward=passward;
    }

    public String getPassward() {
        return passward;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail() {
        return email;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }
    public void setAge(int age){
       this.age=age;
    }

    public int getAge() {
        return age;
    }*/



    /*//快捷键构造
    public User() {
    }

    public User(String username, String passward, String email, String gender, int age) {
        this.username = username;
        this.passward = passward;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    //get和set方法

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/


}
