package com.斗地主.斗地主2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //静态变量
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();


    static {
        //准备牌
        //花色数组
        String[] color = {"红桃", "梅花", "黑桃", "红砖"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //序号
        int serialNumber = 1;

        //拼接后存入集合
        /*//外层 花色
        for (String s : color) {
            //数字
            for (String s1 : number) {
                //添加到集合
                hm.put(serialNumber,(s+s1));
                serialNumber++;
            }
        }*/

        //上面添加的是一下子13张牌,而下面是一次循环添加4张-----这样保证啦他可以按照牌面大小排列
        for (String s1 : number) {
            for (String s : color) {
                //添加到集合
                hm.put(serialNumber, (s + s1));
                //添加序号
                list.add(serialNumber);
                serialNumber++;
            }
        }


        //大王小王
        hm.put(serialNumber, "大王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "小王");
        list.add(serialNumber);


        System.out.println(hm);
        System.out.println(list);

    }

    public PokerGame() {

        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> play1 = new TreeSet<>();
        TreeSet<Integer> play2 = new TreeSet<>();
        TreeSet<Integer> play3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            //遍历----得到索引也就是牌的序号
            int integer = list.get(i);
            if (i <= 2) {
                lord.add(integer);
                continue;
            }
            if (i % 3 == 0) {
                play1.add(integer);

            } else if (i % 2 == 0) {
                play2.add(integer);
            } else {
                play3.add(integer);
            }

        }
        System.out.println(lord);
        System.out.println(play1);
        System.out.println(play2);
        System.out.println(play3);


        look("底牌", lord);
        look("玩家1", play1);
        look("玩家2", play2);
        look("玩家3", play3);
    }

    public void look(String name, TreeSet<Integer> ts) {
        System.out.print(name + ":");
        //遍历treeSet
        for (Integer t : ts) {
            System.out.print(hm.get(t) + " ");
        }
        System.out.println();
    }
}
