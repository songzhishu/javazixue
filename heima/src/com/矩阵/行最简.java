package com.矩阵;

import java.util.Scanner;


public class 行最简 {
    public static void main(String[] args) {
        // 读取用户输入的矩阵
        double[][] matrix = readMatrix();

        // 求解矩阵的行最简形式
        double[][] rowEchelonMatrix = computeRowEchelonForm(matrix);

        // 打印行最简形式的矩阵
        System.out.println("行最简形式的矩阵:");
        printMatrix(rowEchelonMatrix);
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

    // 求解矩阵的行最简形式
    public static double[][] computeRowEchelonForm(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] rowEchelonMatrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            rowEchelonMatrix[i] = matrix[i].clone();
        }

        int lead = 0;
        for (int r = 0; r < rows; r++) {
            if (lead >= cols) {
                break;
            }

            int i = r;
            while (rowEchelonMatrix[i][lead] == 0) {
                i++;
                if (i == rows) {
                    i = r;
                    lead++;
                    if (lead == cols) {
                        break;
                    }
                }
            }

            double[] temp = rowEchelonMatrix[i];
            rowEchelonMatrix[i] = rowEchelonMatrix[r];
            rowEchelonMatrix[r] = temp;

            double lv = rowEchelonMatrix[r][lead];
            for (int j = 0; j < cols; j++) {
                rowEchelonMatrix[r][j] /= lv;
            }

            for (int k = 0; k < rows; k++) {
                if (k != r) {
                    double factor = rowEchelonMatrix[k][lead];
                    for (int j = 0; j < cols; j++) {
                        rowEchelonMatrix[k][j] -= factor * rowEchelonMatrix[r][j];
                    }
                }
            }

            lead++;
        }

        return rowEchelonMatrix;
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
