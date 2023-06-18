package com.矩阵;

import java.util.Scanner;

public class 矩阵加法 {
    public static void main(String[] args) {
        // 读取用户输入的第一个矩阵
        double[][] matrix1 = readMatrix();

        // 读取用户输入的第二个矩阵
        double[][] matrix2 = readMatrix();

        // 检查矩阵维度是否相同
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("两个矩阵的维度不匹配，无法进行加法运算。");
            return;
        }

        // 计算矩阵加法
        double[][] result = matrixAddition(matrix1, matrix2);

        // 打印结果矩阵
        System.out.println("结果矩阵:");
        printMatrix(result);
    }

    // 读取用户输入的矩阵
    public static double[][] readMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入矩阵的行数: ");
        int rows = scanner.nextInt();
        System.out.print("请输入矩阵的列数: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("请输入矩阵的元素，按行输入，使用空格分隔:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }

    // 计算矩阵加法
    public static double[][] matrixAddition(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // 打印矩阵
    public static void printMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
