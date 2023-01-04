package com.day07;

import java.util.Random;
import java.util.Scanner;

/*
 * 红球1-33 不可以重复
 * 篮球1-16 可以重复
 * 一等奖: 6红1蓝
 *
 * 二等奖: 6红不中蓝
 *
 * 三等奖: 5红1蓝
 * 四等奖
 * (1)    5红不中蓝
 *
 * (2)    4红1蓝
 * 五等奖
 * (1)    4红不中蓝
 * (2)    3红1蓝
 * 六等奖
 * (1)    2红1蓝
 * (2)    1红1蓝
 * (3)    不中红1蓝
 * */
public class 模拟双色球 {
    public static void main(String[] args) {
        //用户输入
        Scanner sr = new Scanner(System.in);
        int userArray[] = new int[7];

        for (int i = 0; i < userArray.length; i++) {
            System.out.print(" 请您的第" + (i + 1) + "次选号并请您按要求选数(红球1-33 不可以重复,篮球1-16 可以重复):");
            int input = sr.nextInt();
            userArray[i] = input;
        }
        int finalCode[] = generateNumber();
        for (int i = 0; i < finalCode.length; i++) {
            System.out.println(finalCode[i]);
        }
        int prize = resultJudgment(userArray, finalCode);
        //
        System.out.println("你的中奖等级是:" + prize + "级");

    }

    public static int[] generateNumber() {
        //生成红球号码
        int number[] = new int[7];
        Random sc = new Random();
        //生成红球号码
        for (int i = 0; i < number.length - 1; i++) {
            int a = sc.nextInt(33) + 1;
            if (judge(number, a) == false) {
                number[i] = a;
                i++;
            }

        }
        //生产蓝球号码
        int lan = sc.nextInt(16) + 1;
        number[number.length - 1] = lan;
        return number;
    }

    public static boolean judge(int[] x, int num) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int resultJudgment(int x[], int y[]) {
        //对比红球中多少个
        int sumred = 0;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] == y[i]) {
                sumred += 1;
            }
        }
        int sumBlue = 0;
        if (x[x.length - 1] == y[y.length - 1]) {
            sumBlue = sumBlue + 1;
        }
        int grade = levelJudgment(sumred, sumBlue);
        return grade;
    }

    public static int levelJudgment(int x, int y) {
        if (x == 6 && y == 1) {
            return 1;
        } else if (x == 6 && y == 0) {
            return 2;
        } else if (x == 5 && y == 1) {
            return 3;
        } else if ((x == 5 && y == 0) || (x == 4 && y == 1)) {
            return 4;
        } else if ((x == 4 && y == 0) || (x == 3 && y == 1)) {
            return 5;
        }
        return 6;
    }

}
