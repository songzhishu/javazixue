package com.day13;

public class arrayutil {
    private arrayutil() {
    }

    public static void printarr(int[] arr) {
        System.out.println("打印数组");
        /*StringJoiner sj=new StringJoiner("[",",","]");*/
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }

    public static float getaverage(float[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

}
