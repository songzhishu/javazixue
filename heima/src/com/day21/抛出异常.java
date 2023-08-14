package com.day21;

public class 抛出异常 {
    public static void main(String[] args) {
        int[] arr = null;

        try {
            System.out.println(getMax(arr));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("看看我执行了没!");

    }

    public static int getMax(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundsException {
        int max = arr[0];
        if (arr == null) {
            //手动创建一个异常对象,如果符合条件,那么下面的代码就不会执行
            throw new NullPointerException();
        }
        if (arr.length == 0) {
            //索引越界
            throw new ArrayIndexOutOfBoundsException();

        }
        System.out.println("看看我执行了没!");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }
}
