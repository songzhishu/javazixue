package com.day16.paixue;

import java.util.Random;

public class 插入排序 {
    //将数据分成两份,一份0-n有序,一份n到最后无序,然后遍历无序的插入到有序的
    public static void main(String[] args) {
        //生成乱序
        int[] chaoarr = getChaosarr();
        for (int i = 0; i < chaoarr.length; i++) {
            System.out.print(chaoarr[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");

        //找到无序的起始位置index
        int index = getindex(chaoarr);
        System.out.println(index);

        //排序
        int[] sortarr = getSort(chaoarr, index);
        for (int i = 0; i < sortarr.length; i++) {
            System.out.print(sortarr[i] + " ");
        }

    }

    //获取无序的起始位置
    private static int getindex(int[] chaoarr) {
        //遍历
        for (int i = 0; i < chaoarr.length; i++) {
            if (chaoarr[i] >= chaoarr[i + 1]) {
                return i + 1;//i是有序的,i+1是无序的
            }
        }
        return -1;
    }

    private static int[] getSort(int[] chaoarr, int index) {
        int temp;
        //遍历元素
        for (int i = index; i < chaoarr.length; i++) {
            //插入元素
            /*while (index2>0 && (chaoarr[index2]<=chaoarr[index2-1])){
                temp=chaoarr[index2-1];
                chaoarr[index2-1]=chaoarr[index2];
                chaoarr[index2]=temp;
                index2--;
            }*/
            int k = i;
            for (int j = k; j > 0; j--) {
                if (chaoarr[k] <= chaoarr[k - 1]) {
                    temp = chaoarr[k - 1];
                    chaoarr[k - 1] = chaoarr[k];
                    chaoarr[k] = temp;
                    k--;
                }
            }
        }
        return chaoarr;
    }

    //生成乱序数组;
    private static int[] getChaosarr() {
        //随机数
        Random random = new Random();
        //定义数组
        int[] arr = new int[100];
        //遍历存储
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }

}
