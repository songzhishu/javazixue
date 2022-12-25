package com.day05;

public class 作业小数比大小 {
    public static void main(String[] args) {
        //定义数组
        double []arr={12.9,53.54,75.0,99.1,3.14};
       double min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min=arr[i];
            }
        }
        System.out.println("最小值:"+min);
    }
}
