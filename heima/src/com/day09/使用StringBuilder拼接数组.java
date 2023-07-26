package com.day09;

public class 使用StringBuilder拼接数组 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3, 4, 5, 6};

        //输出
        System.out.println(arrtoString(arr));

        //StringBuilder适用于字符串的拼接和反转

    }

    public static String arrtoString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }
}
