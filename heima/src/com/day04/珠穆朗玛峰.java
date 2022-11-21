package com.day04;

import java.util.Scanner;
/*需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，

        ​	假如我有一张足够大的纸，它的厚度是0.1毫米。

        ​	请问，我折叠多少次，可以折成珠穆朗玛峰的高度?*/

public class 珠穆朗玛峰 {

    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        double mountain=8844430,paper=0.1;
        int i=0;
        while (paper<mountain){
            paper=paper*2;
            i++;
        }
        System.out.println(i);
    }
}
