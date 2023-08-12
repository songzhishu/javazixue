package com.斗地主.斗地主1;

import java.util.ArrayList;
import java.util.Collections;

public class playingCards {
    //准备牌 -------我不可能就打了一局,那么每一句都要准备牌,
    //所以准备牌是应该随着类加载的,那么我就可以将其定义为静态代码块--只执行一次


    //创建存储牌的集合 -----定义到这里是为了后面的操作使用,如果在静态代码块的里在其他的方法里就不能访问
    //但是要设置为静态变量-------因为静态只能访问静态
    static ArrayList<String> list = new ArrayList<>();
    //定义三个集合
    ArrayList<String> ni = new ArrayList<>();
    ArrayList<String> wo = new ArrayList<>();
    ArrayList<String> ta = new ArrayList<>();
    ArrayList<String> dizhu = new ArrayList<>();


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

    }

    public playingCards() {


        //洗牌 ---打乱
        Collections.shuffle(list);
        System.out.println(list);
        lookpk(list);
    }

    public void lookpk(ArrayList<String> list) {
        //遍历集合存入数据
        for (int i = 0; i < list.size(); i = i + 3) {
            //获取牌---三个发给谁呐!
            if (i < list.size() - 3) {
                ni.add(list.get(i));
                wo.add(list.get(i + 1));
                ta.add(list.get(i + 2));

            } else {
                dizhu.add(list.get(list.size() - 3));
                dizhu.add(list.get(list.size() - 2));
                dizhu.add(list.get(list.size() - 1));

            }
        }
        //看牌
        System.out.println(ni);
        System.out.println(wo);
        System.out.println(ta);
        System.out.println(dizhu);
    }

}


