package com.day13.jicheng1;

public class StudentLeader extends Student {
    private String job;

    public StudentLeader() {
    }

    public StudentLeader(String nanme, int age, String gender, String nationality, String school, String studentID, String job) {
        super(nanme, age, gender, nationality, school, studentID);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting() {
        System.out.println("学生干部爱开会!");
    }
}
