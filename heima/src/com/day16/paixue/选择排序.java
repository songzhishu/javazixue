package com.day16.paixue;

import java.util.Random;

public class 选择排序 {
    //从0索引开始,拿每一个索引上的元素跟上面的元素依次比较,小的在前,大的在后
    //冒泡是从一开始就比然后确定最大的数,然后是第二大的,以此类推
    //选择排序恰恰相反,比较一轮后先确定最小的数,然后是第二小的数,以此类推


    public static void main(String[] args) {
        //生成乱序
        int[] chaoarr = getChaosarr();
        for (int i = 0; i < chaoarr.length; i++) {
            System.out.print(chaoarr[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        //排序
        int[] sortarr = getSort(chaoarr);
        for (int i = 0; i < sortarr.length; i++) {
            System.out.print(sortarr[i] + " ");
        }

    }

    private static int[] getSort(int[] chaoarr) {
        int temp;

        //遍历数组外---->比较次数
        for (int i = 0; i < chaoarr.length - 1; i++) {
            //交换次序
            for (int j = i + 1; j < chaoarr.length; j++) {
                if (chaoarr[i] >= chaoarr[j]) {
                    temp = chaoarr[i];
                    chaoarr[i] = chaoarr[j];
                    chaoarr[j] = temp;
                    //int j = i+1为什么要定义这个呐!是因为第一次比较是0索引和1以后的,索引比较,加一保证了每一次都是可以和后一个比较而不是从头比较
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
