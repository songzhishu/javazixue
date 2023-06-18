import java.util.Scanner;

public class 伴随矩阵 {
    public static void main(String[] args) {
        // 读取用户输入的矩阵
        double[][] matrix = readMatrix();

        // 计算矩阵的行列式
        double determinant = matrixDeterminant(matrix);

        // 判断行列式是否为零
        if (determinant == 0) {
            System.out.println("矩阵的行列式为零，无法计算伴随矩阵。");
        } else {
            // 计算矩阵的伴随矩阵
            double[][] adjointMatrix = matrixAdjoint(matrix);

            // 打印伴随矩阵
            System.out.println("伴随矩阵:");
            printMatrix(adjointMatrix);
        }
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

    // 计算矩阵的行列式
    public static double matrixDeterminant(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            throw new IllegalArgumentException("矩阵必须是方阵。");
        }

        if (rows == 1) {
            return matrix[0][0];
        }

        double determinant = 0;

        for (int i = 0; i < rows; i++) {
            double[][] submatrix = createSubmatrix(matrix, i, 0);
            double cofactor = Math.pow(-1, i) * matrix[i][0] * matrixDeterminant(submatrix);
            determinant += cofactor;
        }

        return determinant;
    }

    // 创建剩余子矩阵
    public static double[][] createSubmatrix(double[][] matrix, int rowToRemove, int colToRemove) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] submatrix = new double[rows - 1][cols - 1];

        int rowIndex = 0;
        for (int i = 0; i < rows; i++) {
            if (i == rowToRemove) {
                continue;
            }

            int colIndex = 0;
            for (int j = 0; j < cols; j++) {
                if (j == colToRemove) {
                    continue;
                }

                submatrix[rowIndex][colIndex] = matrix[i][j];
                colIndex++;
            }

            rowIndex++;
        }

        return submatrix;
    }

    // 计算矩阵的代数余子式矩阵
    public static double[][] matrixAdjoint(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] adjointMatrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double[][] submatrix = createSubmatrix(matrix, i, j);
                double cofactor = Math.pow(-1, i + j) * matrixDeterminant(submatrix);
                adjointMatrix[j][i] = cofactor;
            }
        }

        return adjointMatrix;
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
