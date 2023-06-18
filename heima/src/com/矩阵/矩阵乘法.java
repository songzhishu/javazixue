package com.矩阵;

import java.util.Scanner;


public class 矩阵乘法 {
    public static void main(String[] args) {
        // 读取用户输入的第一个矩阵
        double[][] matrix1 = readMatrix();

        // 读取用户输入的第二个矩阵
        double[][] matrix2 = readMatrix();

        // 检查矩阵维度是否匹配
        if (matrix1[0].length != matrix2.length) {
            System.out.println("第一个矩阵的列数与第二个矩阵的行数不匹配，无法进行乘法运算。");
            return;
        }

        // 计算矩阵乘法
        double[][] result = matrixMultiplication(matrix1, matrix2);

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

    // 计算矩阵乘法
    public static double[][] matrixMultiplication(double[][] matrix1, double[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
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
