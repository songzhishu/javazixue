package com.day05;

public class 作业筛选数组 {
    public static void main(String[] args) {
        /*//定义数组
        int []arr ={23,85,64,97,46,66,48,21,69,44,78};
        int j=0,o=0;
        //遍历数组判断奇偶
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                o++;
            }else{
                j++;
            }
        }
        System.out.println("奇数:"+j+"偶数:"+o);
        //取出来奇数偶数成为一个新的数组
        int arrj[]=new int[j];
        int arro[]=new int[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                arro[i]=arr[i];
            }else{
                arrj[i]=arr[i];
            }
        }
        for (int i = 0; i < arro.length; i++) {
            System.out.println(arro[i]);
        }*/
        //1.定义原数组
        int[] arr = {12, 23, 34, 45, 67, 78, 11, 22};
        //2.定义空数组
        int[] brr = new int[arr.length];
        //3.定义变量代表奇数要存放的位置
        int left = 0;
        //4.定义变量代表偶数要存放的位置
        int right = arr.length - 1;
        //5.对原数组进行遍历
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                //5.1如果是奇数就往左边放
                brr[left] = arr[i];
                //5.2存放之后让索引向右移动
                left++;
            } else {
                //5.3如果是偶数就往右边放
                brr[right] = arr[i];
                //5.4存放之后让索引向左移动
                right--;
            }
        }
        //6.打印brr数组
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        /*别人遍历数组或者是插入数据可以直接定义数组下标,以改变数组的索引来完成
         * 对数值的改变*/

    }
}
