package com.day13;

public class dog {

    String name;
    int age;
    //静态变量(公共的,有类所共有)
    static String hobby;

    //非静态的成员方法
    public void Show1(dog this) {
        System.out.println("当前调用者的地址:" + this);
        //这个地址是虚拟机分配的地址然后进行赋值的

        //System.out.println("名字:" + name + "年龄:" + age + "爱好:" + hobby);
        System.out.println("名字:" + this.name + "年龄:" + this.age + "爱好:" + hobby);
        //这个和上面的等价因为,这个代码没有涉及到局部变量和成员变量重名所以就省略

        //调用其他方法
        this.Show2();
        //如果dog1调用了show1,当代码执行的到这里的时候就相当于dog1调用了show2
    }

    public void Show2() {
        System.out.println("show2" + this);
    }

    //静态方法
    public static void method() {
        System.out.println("静态方法");
    }
}
