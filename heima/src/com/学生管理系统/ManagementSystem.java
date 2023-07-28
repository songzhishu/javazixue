package com.学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-----------------欢迎来到黑马学生管理系统-------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    //break loop;
                    System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }

    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        //利用空参构造先创建学生对象
        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                //表示id已经存在，需要重新录入
                System.out.println("id已经存在，请重新录入");
            } else {
                //表示id不存在，表示可以使用
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        s.setAddress(address);


        //把学生对象添加到集合当中
        list.add(s);

        //提示一下用户
        System.out.println("学生信息添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();
        //查询id在集合中的索引
        int index = getIndex(list, id);
        //对index进行判断
        //如果-1，就表示不存在，结束方法，回到初始菜单
        if (index >= 0) {
            //如果大于等于0的，表示存在，直接删除
            list.remove(index);
            System.out.println("id为：" + id + "的学生删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id = sc.next();

        int index = getIndex(list, id);

        if (index == -1) {
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }

        //当代码执行到这里，表示什么？表示当前id是存在的。
        //获取要修改的学生对象
        Student stu = list.get(index);

        //输入其他的信息并修改
        System.out.println("请输入要修改的学生姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");


    }


    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            //结束方法
            return;
        }

        //打印表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        //当代码执行到这里，表示集合中是有数据的
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }


    //判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        //循环遍历集合得到里面的每一个学生对象
        /*for (int i = 0; i < list.size(); i++) {
            //拿到学生对象后，获取id并进行判断
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)){
                //存在，true
                return true;
            }
        }
        // 不存在false
        return false;*/
        return getIndex(list, id) >= 0;
    }

    //通过id获取索引的方法
    public static int getIndex(ArrayList<Student> list, String id) {
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //得到每一个学生对象
            Student stu = list.get(i);
            //得到每一个学生对象的id
            String sid = stu.getId();
            //拿着集合中的学生id跟要查询的id进行比较
            if (sid.equals(id)) {
                //如果一样，那么就返回索引
                return i;
            }
        }
        //当循环结束之后还没有找到，就表示不存在，返回-1.
        return -1;
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
}
