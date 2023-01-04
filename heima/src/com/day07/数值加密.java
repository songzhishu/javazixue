package com.day07;

import java.util.Scanner;

public class 数值加密 {
    public static void main(String[] args) {
        //输入要加密的数字
        Scanner sr = new Scanner(System.in);
        System.out.print("请输入你要加密的数值:");
        int originalCode = sr.nextInt();
        //判断他是几位数
        int digit = 1;
        for (int i = 0; i < 10; i++) {
            if (originalCode > 10) {
                originalCode = originalCode / 10;
                digit++;
            }
        }
        //生成对应长度的数组
        int arr[] = new int[digit];
        //将加密值存入数组

        for (int i = 0; i < arr.length; i++) {
            //取数
            if (originalCode <= 9) {
                arr[0] = originalCode;
                //System.out.println(arr[0]);
            } else {
                for (int k = 0; k < arr.length; k++) {
                    if (originalCode <= 9) {
                        arr[0] = originalCode;
                        //System.out.println(arr[0]);
                    } else {
                        int l = arr.length - 1;
                        for (int j = 0; j < digit; j++) {
                            //l是为了方便赋值
                            if (l >= 0) {
                                arr[l] = (originalCode % 10);
                                l--;
                                break;
                            }
                        }
                    }
                    originalCode = originalCode / 10;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



       /* int arr1[]=encryption(arr);
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" "+arr1[i]+" ");
        }
        System.out.print("]");
    }*/

   /* public static int[] encryption(int x[]) {
        //进行加密操作
        for (int i = 0; i < x.length; i++) {
            x[i] = (x[i] + 5) % 10;
        }


        //反转
        int j = x.length-1;
        for (int i = 0; i < x.length; i++) {
            if(x.length!=1){
                if (i < j) {
                    int temp=0;
                    temp=x[i];
                    x[i] = x[j];
                    x[j]=temp;
                    i++;
                    j--;
                }
            }
        }
        return x;
    }*/
}
