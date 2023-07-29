package com.学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementSystem {
    public static void startstudentsystem() {

        Scanner sr = new Scanner(System.in);

        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-----------------------欢迎你进入学生管理系统-------------------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");

            //输入选择
            String option = sr.next();

            switch (option) {
                case "1" -> addstudent(list);
                case "2" -> deletestudent(list);
                case "3" -> modifystudent(list);
                case "4" -> findstudent(list);
                case "5" -> {
                    System.out.println("退出");
                    //break loop;//跳出循环-->指定跳出的循环体
                    System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("没有这个选项!");
            }
        }


    }


    //添加
    public static void addstudent(ArrayList<Student> list) {
        //System.out.println("添加学生");
        //键盘录入
        Scanner sr = new Scanner(System.in);
        Student student = new Student();


        while (true) {
            System.out.println("输入学生的id:");
            String studentid = sr.next();
            boolean flag = judje(list, studentid);
            if (flag) {
                System.out.println("id已经存在,请重新录入!");
            } else {
                student.setId(studentid);
                break;
            }
        }

        System.out.println("输入学生的姓名:");
        String studentname = sr.next();
        student.setName(studentname);
        System.out.println("输入学生的age:");
        int studentage = sr.nextInt();
        student.setAge(studentage);
        System.out.println("输入学生的家庭住址:");
        String studentaddress = sr.next();
        student.setAddress(studentaddress);

        list.add(student);

    }

    //删除
    public static void deletestudent(ArrayList<Student> list) {
        //输入
        System.out.println("输入你要删除的id:");
        Scanner sr = new Scanner(System.in);
        String id = sr.next();
        if (getindex(list, id) != -1) {
            list.remove(getindex(list, id));
        } else {
            System.out.println("你要删除的id不存在!");
        }
    }

    //修改
    public static void modifystudent(ArrayList<Student> list) {
        //输入
        System.out.println("输入你要修改的id:");
        Scanner sr = new Scanner(System.in);
        String id = sr.next();
        if (getindex(list, id) != -1) {
            //修改

            System.out.println("修改学生姓名为:");
            list.get(getindex(list, id)).setName(sr.next());
            System.out.println("修改学生年龄为:");
            list.get(getindex(list, id)).setAge(sr.nextInt());
            System.out.println("修改学生家庭住址为:");
            list.get(getindex(list, id)).setAddress(sr.next());
        } else {
            System.out.println("你要删除的id不存在!");
        }
    }

    //查询
    public static void findstudent(ArrayList<Student> list) {
        //System.out.println("查询学生");
        if (list.size() == 0) {
            System.out.println("当前无学生信息,请添加后在查询");
            return;
        }
        System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名:" + list.get(i).getName() + "id:" + list.get(i).getId() + "年龄:" + list.get(i).getAge() + "家庭地址:" + list.get(i).getAddress());
        }


    }

    //判断id在集合里嘛
    public static boolean judje(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //查找id
    public static int getindex(ArrayList<Student> list, String id) {
        //遍历
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }


}

    /*//菜单方法
    public static void menu() {
        //创建集合
        ArrayList<Student> list = new ArrayList<>();


        //输出选择
        Scanner sr = new Scanner(System.in);
        System.out.println("-----------------------欢迎你进入学生管理系统-------------------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入您的选择:");
        switch (sr.next()) {
            case "添加学生" -> list = addStudent();
            case "删除学生" -> list = deletestudent(list);
            case "修改学生" -> list = modifystudent(list);
            case "查询学生" -> showlist(list);
            case "退出" -> menu();
        }

    }

    //添加学生功能
    public static ArrayList<Student> addStudent() {
        //创建集合
        ArrayList<Student> temporarylist = new ArrayList<>();

        //键盘录入
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            //创建用户对象
            Student student = new Student();
            System.out.println("输入第" + (i + 1) + "个学生的姓名:");
            String studentname = sr.next();
            System.out.println("输入第" + (i + 1) + "个学生的id:");
            int studentid = sr.nextInt();
            System.out.println("输入第" + (i + 1) + "个学生的age:");
            int studentage = sr.nextInt();
            System.out.println("输入第" + (i + 1) + "个学生的家庭住址:");
            String studentaddress = sr.next();

            //调用set函数存储
            student.setName(studentname);
            student.setId(studentid);
            student.setAge(studentage);
            student.setAddress(studentaddress);

            //保证id唯一

            temporarylist.add(student);
            if (i > 1) {
                for (int j = 0; j < temporarylist.size(); j++) {
                    if (studentid == temporarylist.get(j).getId()) {
                        System.out.println("已经存在此id请您重新输入:");
                        //删除刚刚存入学生对象
                        temporarylist.remove(i);
                    }
                }
            }


            System.out.println("您是否想要退出添加(Y-->退出,N-->继续):");
            String option = sr.next();
            if (option.equals("Y")) {
                break;
            }

        }
        menu();
        return temporarylist;
    }

    //删除学生
    public static ArrayList<Student> deletestudent(ArrayList<Student> list) {
        //定义返回结果的容器
        ArrayList<Student> deletelist = new ArrayList<>();

        //输入删除的id
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你要删除的学生id:");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            if (sr.nextInt() == list.get(i).getId()) {
                list.remove(i);
                break;
            }
        }
        System.out.println("你要删除的学生不存在!");
        menu();
        return deletelist = list;
    }

    //修改功能
    public static ArrayList<Student> modifystudent(ArrayList<Student> list) {
        //定义返回结果的容器
        ArrayList<Student> modifylist = new ArrayList<>();

        //输入修改学生的id
        Scanner sr = new Scanner(System.in);
        System.out.println("输入你要修改的学生id:");

        //遍历
        for (int i = 0; i < list.size(); i++) {
            if (sr.nextInt() == list.get(i).getId()) {
                //修改信息
                System.out.println("修改学生id为:");
                list.get(i).setId(sr.nextInt());
                System.out.println("修改学生姓名为:");
                list.get(i).setName(sr.next());
                System.out.println("修改学生年龄为:");
                list.get(i).setAge(sr.nextInt());
                System.out.println("修改学生家庭住址为:");
                list.get(i).setAddress(sr.next());
                break;
            }
        }
        System.out.println("你修改的id不存在!");
        menu();
        return modifylist = list;
    }

    public static void showlist(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名:" + list.get(i).getName() + "id:" + list.get(i).getId() + "年龄:" + list.get(i).getAge() + "家庭地址:" + list.get(i).getAddress());
        }
        menu();

    }*/
//呜呜我写的狗屎!!!