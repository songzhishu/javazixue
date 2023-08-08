package com.day16;

public class test {
    public static void main(String[] args) {
        String[] arr = {"h", "e", "l", "l", "o"};
        int a = arr.length - 1;
        String temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
            a--;
            if (a == i || a < i) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
