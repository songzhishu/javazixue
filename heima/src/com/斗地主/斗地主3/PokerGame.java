package com.斗地主.斗地主3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    //静态变量


    //牌盒子
    static ArrayList<String> list = new ArrayList<>();

    //价值集合

    static HashMap<String, Integer> value = new HashMap<>();


    static {
        //准备牌
        //花色数组
        String[] color = {"红桃", "梅花", "黑桃", "红砖"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //拼接后存入集合
        //外层 花色
        for (String s : color) {
            //数字
            for (String s1 : number) {
                //添加到集合
                list.add(s + s1);
            }
        }
        //大王小王
        list.add("大王");
        list.add("小王");

        //指定牌的价值
        value.put("J", 11);
        value.put("Q", 12);
        value.put("K", 13);
        value.put("A", 14);
        value.put("2", 15);
        value.put("小王", 16);
        value.put("大王", 17);

    }

    public PokerGame() {

        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {


            if (i <= 2) {
                lord.add(list.get(i));
                continue;
            }
            if (i % 3 == 0) {
                play1.add(list.get(i));

            } else if (i % 2 == 0) {
                play2.add(list.get(i));
            } else {
                play3.add(list.get(i));
            }

        }



        /*System.out.println(lord);
        System.out.println( play1);
        System.out.println( play2);
        System.out.println( play3);*/


    /*    look("底牌",lord);
        look("玩家1",play1);
        look("玩家2",play2);
        look("玩家3",play3);*/
    }

    public void order(ArrayList<String> lsit) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

    }
}
