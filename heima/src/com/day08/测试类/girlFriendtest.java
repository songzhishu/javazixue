package com.day08.测试类;

import com.day08.javabean类.girlFriend;

public class girlFriendtest {
    public static void main(String[] args) {
        girlFriend player1 = new girlFriend();
        player1.name = "翠花";
        player1.setAge(22);
        player1.setHeight(1.56);
        System.out.println(player1.getAge());
        System.out.println(player1.getHeight());
        /*//女朋友类里面的get函数写啦一个返回值是对的
         * 但是返回后,想要输出我们要将他的值所显示出来
         * 我们可以将这个值赋值给其他变量
         * 或者我们直接sout输出*/

        System.out.println(player1.name);
        player1.sleep();

    }
}
