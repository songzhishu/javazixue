package com.day13.jicheng3;

public class manager extends staff {
    private double managementBonus;

    //空参构造
    public manager() {

    }

    //有参构造方法
    public manager(String id, String name, double wages, double managementBonus) {
        super(id, name, wages);
        this.managementBonus = managementBonus;
    }

    public double getManagementBonus() {
        return managementBonus;
    }

    public void setManagementBonus(double managementBonus) {
        this.managementBonus = managementBonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人!");
    }

    //展示
    public void show() {
        eat();
        work();
        this.eat();
        this.work();
        super.eat();
        super.work();
    }
}
