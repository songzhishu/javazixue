package com.矩阵;

import java.util.Scanner;

public class 矩阵的逆 {
    public static void main(String[] args) {
        // 读取用户输入的矩阵行数和列数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入矩阵的行数: ");
        int rows = scanner.nextInt();
        System.out.print("请输入矩阵的列数: ");
        int cols = scanner.nextInt();

        // 创建一个二维数组用于存储矩阵数据
        double[][] matrixData = new double[rows][cols];

        // 读取用户输入的矩阵元素
        System.out.println("请输入矩阵的元素，按行输入，使用空格分隔:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixData[i][j] = scanner.nextDouble();
            }
        }

        // 求矩阵的逆
        double[][] inverseMatrixData = invertMatrix(matrixData);

        // 打印逆矩阵
        System.out.println("逆矩阵:");
        printMatrix(inverseMatrixData);
    }

    // 求矩阵的逆
    public static double[][] invertMatrix(double[][] matrix) {
        int n = matrix.length;

        // 创建单位矩阵
        double[][] identity = new double[n][n];
        for (int i = 0; i < n; i++) {
            identity[i][i] = 1;
        }

        // 利用高斯消元法计算逆矩阵
        for (int i = 0; i < n; i++) {
            double pivot = matrix[i][i];

            // 除以主元素
            for (int j = 0; j < n; j++) {
                matrix[i][j] /= pivot;
                identity[i][j] /= pivot;
            }

            // 消元
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matrix[k][i];
                    for (int j = 0; j < n; j++) {
                        matrix[k][j] -= factor * matrix[i][j];
                        identity[k][j] -= factor * identity[i][j];
                    }
                }
            }
        }

        return identity;
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
