package com.矩阵;

import java.util.Scanner;


public class 矩阵的秩 {
    public static void main(String[] args) {
        // 读取用户输入的矩阵
        double[][] matrix = readMatrix();

        // 计算矩阵的秩
        int rank = computeMatrixRank(matrix);

        // 输出矩阵的秩
        System.out.println("矩阵的秩为: " + rank);
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

    // 计算矩阵的秩
    public static int computeMatrixRank(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rank = 0;

        for (int i = 0; i < rows; i++) {
            // 查找主元素所在列的非零元素
            int pivot = -1;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    pivot = j;
                    break;
                }
            }

            // 如果找不到主元素所在列的非零元素，跳过当前行
            if (pivot == -1) {
                continue;
            }

            // 将主元素所在列的其他元素消为零
            for (int k = 0; k < rows; k++) {
                if (k != i && matrix[k][pivot] != 0) {
                    double factor = matrix[k][pivot] / matrix[i][pivot];
                    for (int j = 0; j < cols; j++) {
                        matrix[k][j] -= factor * matrix[i][j];
                    }
                }
            }

            // 增加秩的计数
            rank++;
        }

        return rank;
    }
}
