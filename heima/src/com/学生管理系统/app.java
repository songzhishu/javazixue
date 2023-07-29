package com.学生管理系统;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        //输入
        Scanner sr = new Scanner(System.in);
        //创建集合

        ArrayList<User> userlist = new ArrayList<>();

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作:1、登录2、注册3、忘记密码");
            //输入选择
            String choice = sr.next();

            //选择
            switch (choice) {
                case "1" -> login(userlist);
                case "2" -> register(userlist);
                case "3" -> forgetpassword(userlist);
                case "4" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项!");
            }
        }

    }

    //遍历
    private static void printuserlist(ArrayList<User> userlist) {
        for (int i = 0; i < userlist.size(); i++) {
            User user = userlist.get(i);
            System.out.println("用户名:" + user.getUsername() + "身份证号:" + user.getID() + "用户密码" + user.getPassword() + "手机号码:" + user.getPhonenumber());
        }
    }

    //忘记密码
    private static void forgetpassword(ArrayList<User> userlist) {
        Scanner sr = new Scanner(System.in);
        System.out.println("输入用户名:");
        String username = sr.next();
        boolean flag = judge2(userlist, username);

        if (!flag) {
            System.out.println("当前用户" + username + "未注册!");
            return;
        }
        System.out.println("请输入手机号码:");
        String phonenumber = sr.next();
        System.out.println("请输入身份证号码:");
        String IDcard = sr.next();
        //比较用户输入的和集合的一致

        //获取集合里的对象的索引
        int index = finduser(userlist, username);

        if (index != -1) {
            //对比一下用户输入的身份证和手机号,获取对象
            User user = userlist.get(index);
            if (!(user.getPhonenumber().equals(phonenumber) && user.getID().equals(IDcard))) {
                System.out.println("身份证号或者手机号输入有误,不能修改密码!");
                return;
            }
            String password;
            //输入密码
            while (true) {
                System.out.println("输入密码:");
                password = sr.next();
                System.out.println("再次输入密码:");
                String password2 = sr.next();
                if (password2.equals(password)) {
                    System.out.println("两次密码一致!");
                    break;
                } else {
                    System.out.println("两次密码不一致!");
                    continue;
                }
            }
            //修改密码
            user.setPassword(password);
            System.out.println("密码修改完成!");

        }


    }

    //获取索引
    private static int finduser(ArrayList<User> userlist, String username) {
        //遍历集合
        for (int i = 0; i < userlist.size(); i++) {
            if (username.equals(userlist.get(i).getUsername())) {
                return i;
            }
        }
        return -1;
    }

    //注册
    private static void register(ArrayList<User> userlist) {
        //创建用户对象
        User user = new User();
        String username;
        String password;
        String IDcard;
        String phonenumber;

        //输入
        Scanner sr = new Scanner(System.in);
        while (true) {
            System.out.println("输入用户名:");
            username = sr.next();
            boolean flag1 = judge(username);
            if (!flag1) {
                System.out.println("格式不满足条件,请重新输入!");
                continue;
            }

            //判断唯一
            boolean flag2 = judge2(userlist, username);
            if (flag2) {
                System.out.println(username + "用户名已经存在,请重新录入!");
                continue;
            } else {
                System.out.println("用户名可用,请进行后序的操作!");
                break;
            }
        }

        //验证密码
        while (true) {
            System.out.println("输入密码:");
            password = sr.next();
            System.out.println("再次输入密码:");
            String password2 = sr.next();
            if (!password.equals(password2)) {
                System.out.println("密码不一致,请您重新输入!");
                continue;
            } else {
                System.out.println("两次密码一致,请继续操作!");
                break;
            }
        }

        //身份证验证
        while (true) {
            System.out.println("请输入身份证ID:");
            IDcard = sr.next();
            boolean flag3 = validateIDcard(IDcard);
            if (flag3) {
                System.out.println("身身份证符合要求,继续操作!");
                break;
            } else {
                System.out.println("身份证错误,请继续输入!");
                continue;
            }
        }

        //手机号验证
        while (true) {
            System.out.println("请输入手机号码:");
            phonenumber = sr.next();

            boolean flag = validatephonenumber(phonenumber);
            if (flag) {
                System.out.println("手机号码正确,请继续操作!");
                break;
            } else {
                System.out.println("手机号码不正确,请重新录入!");
                continue;
            }
        }

        //存入用户对象
        user.setPassword(password);
        user.setID(IDcard);
        user.setPhonenumber(phonenumber);
        user.setUsername(username);
        //存入集合
        userlist.add(user);
        System.out.println("注册成功!");
        //遍历
        printuserlist(userlist);

    }

    //验证手机号
    private static boolean validatephonenumber(String phonenumber) {
        //长度
        if (phonenumber.length() != 11) {
            return false;
        }
        //开头不能是0
        if (phonenumber.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < phonenumber.length(); i++) {
            char c = phonenumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    //验证身份证
    private static boolean validateIDcard(String iDcard) {
        //长度
        if (iDcard.length() != 18) {
            return false;
        }
        //开头不能是0
        if (iDcard.startsWith("0")) {
            return false;
        }
        //前十七位数字
        for (int i = 0; i < iDcard.length() - 1; i++) {
            if (!(iDcard.charAt(i) >= '0' && iDcard.charAt(i) <= '9')) {
                return false;
            }
        }
        //最后一个字符
        char endchar = iDcard.charAt(iDcard.length() - 1);
        if ((endchar >= '0' && endchar <= '9') || (endchar == 'x') || (endchar == 'X')) {
            return true;
        } else {
            return false;
        }

    }

    //判断用户名是不是合法
    private static boolean judge(String username) {
        //长度判断
        int len = username.length(), sum = 0;
        if (3 <= len && len <= 15) {
            //字符判断
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if (c >= '0' && c <= '9') {
                    sum++;
                }
            }

            if (sum != username.length()) {
                return true;
            }

        }
        return false;
    }

    //登录
    private static void login(ArrayList<User> userlist) {
        Scanner sr = new Scanner(System.in);
        //三次机会!
        for (int i = 0; i < 3; i++) {
            //输入

            System.out.println("请输入用户名:");
            String username = sr.next();
            boolean flag = judge2(userlist, username);
            //判断用户是否注册
            if (!flag) {
                //不存在
                System.out.println("当前用户尚未注册,请注册后登录!");
                return;
            }
            System.out.println("请输入密码:");
            String password = sr.next();

            //调用getcode获取验证码
            while (true) {
                String code1 = getcode();
                System.out.println("验证:" + code1);
                System.out.println("请输入验证码:");
                String code = sr.next();
                if (code.equalsIgnoreCase(code1)) {
                    System.out.println("验证码正确!");
                    break;
                } else {
                    System.out.println("验证码错误!");
                    continue;
                }
            }
            //验证用户名和密码
            //传递一个全部但是不完整的参数就可以,只传递我们需要判断的
            User user = new User(username, password, null, null);
            boolean result = checkuserinfo(userlist, user);
            if (result) {
                System.out.println("登录成功!可以使用学生管理系统!");
                //怎么调用
                //创建对象,调用方法,启动学生管理系统
                ManagementSystem a = new ManagementSystem();
                a.startstudentsystem();
                break;
            } else {
                System.out.println("登录失败哦!仔细检查一下密码和用户名");
                if (i == 2) {
                    System.out.println("当前账户:" + username + "被锁定五分钟后重试!");
                    return;
                } else {
                    System.out.println("当前账户:" + username + "还有" + (2 - i) + "次机会哦");
                }
            }
        }


    }

    //判断用户输入的用户名和密码在集合里并且是否一致
    private static boolean checkuserinfo(ArrayList<User> userlist, User user) {
        for (int i = 0; i < userlist.size(); i++) {
            User userk = userlist.get(i);
            if (userk.getUsername().equals(user.getUsername()) && userk.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    //验证码
    private static String getcode() {
        //以前我们创建的是数组,现在我们可以使用集合
        //创建集合
        ArrayList<Character> list = new ArrayList<>();
        //往集合里面添加数据(a~z,A~Z)
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        //随机抽取字符
        Random ra = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = ra.nextInt(list.size());
            //抽取拼接
            sb.append(list.get(index));
        }
        //随机数字
        int number = ra.nextInt(10);
        //拼接
        sb.append(number);

        //实现数字随机出现,由字符串变为数组后在打乱顺序,然在拼接为字符串
        char[] arr = sb.toString().toCharArray();
        //获取前四个的随机索引
        int exchangeindex = ra.nextInt(3);
        char temp = arr[exchangeindex];
        //交换位置
        arr[exchangeindex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        //转换为字符串

        return new String(arr);
    }

    //判断用户是否存在
    private static boolean judge2(ArrayList<User> userlist, String username) {
        for (int i = 0; i < userlist.size(); i++) {
            if (userlist.get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
