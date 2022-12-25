package com.day05;

import java.util.Random;

public class 打乱数组的数据 {
    public static void main(String[] args) {
        //定义数组
        int []arr ={1,2,3,4,5,6,7,8,9};
        //获取随机索引
        Random r =new Random();
        //第三方数
        int temp =0;
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int a= r.nextInt(arr.length);//a就相当于索引,它由随机函数生成
            temp =arr[i];
            arr[i]=arr[a];
            arr[a]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
/*
package com.day05;

        import java.util.Random;

public class aa {
    public static void main(String[] args) {
        //定义数组
        int []arr={1,2,3,4,5,6,7,8,9};
        //导入随机函数
        Random shu =new Random();
        for (int i = 0; i < arr.length; i++) {
            //创立建随机索引,也就是下标
            int xiabiao = shu.nextInt(arr.length);
            int temp=0;
            temp=arr[i];
            arr[i]=arr[xiabiao];
            arr[xiabiao]=temp;

        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
*/

