package com.day13.jicheng1;

public class Student extends Person {
    private String school;
    private String studentID;

    public Student() {
    }

    public Student(String nanme, int age, String gender, String nationality, String school, String studentID) {
        super(nanme, age, gender, nationality);
        this.school = school;
        this.studentID = studentID;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public void work() {
        System.out.println("我是学生,我的工作是学习");
    }
}
