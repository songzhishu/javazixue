package com.day17.fanxing;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //创建对象
        dragonLi dl = new dragonLi("狸花猫", 2);
        hsq h = new hsq("哈士奇", 3);
        persianCat persianCat = new persianCat("破四毛", 4);
        teddy teddy = new teddy("泰迪", 6);
        //创建集合
        ArrayList<Animal> list = new ArrayList<>();
        list.add(dl);
        list.add(h);
        list.add(persianCat);
        list.add(teddy);

        ArrayList<dragonLi> list1 = new ArrayList<>();
        list1.add(dl);

        ArrayList<hsq> list2 = new ArrayList<>();
        list2.add(h);

        ArrayList<persianCat> list3 = new ArrayList<>();
        list3.add(persianCat);

        ArrayList<teddy> list4 = new ArrayList<>();
        list4.add(teddy);


        //只能养猫
        keeppet1(list1);

        keeppet1(list3);

        System.out.println("----------------------");
        //只能养狗

        keeppet2(list2);

        keeppet2(list4);
        System.out.println("----------------------");
        keeppet3(list);
        keeppet3(list1);
        keeppet3(list2);
        keeppet3(list3);
        keeppet3(list4);

    }

    //只能养猫
    public static void keeppet1(ArrayList<? extends cat> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eat();
        }
    }

    //只能养狗
    public static void keeppet2(ArrayList<? extends dog> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eat();
        }
    }

    //只能养这些动物其他的类型不可以
    public static void keeppet3(ArrayList<? extends Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eat();
        }
    }


}
