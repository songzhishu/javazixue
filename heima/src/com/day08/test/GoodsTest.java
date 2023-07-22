package com.day08.test;

import com.day08.javabean.Goods;

public class GoodsTest {
    public static void main(String[] args) {
        //创建数组
        Goods[] arr = new Goods[3];

        //创建商品对象
        Goods g1 = new Goods("001", "华为", 9999, 50);
        Goods g2 = new Goods("002", "小米", 999, 500);
        Goods g3 = new Goods("003", "狗屎", 99, 5000);

        //存入数组
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());

        }
    }
}
