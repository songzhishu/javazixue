import java.util.Scanner;

public class 行列式 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入矩阵的维数 n：");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("请输入矩阵的元素（按行输入，每个元素以空格分隔）：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("您输入的矩阵为：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int determinant = calculateDeterminant(matrix, n);
        System.out.println("矩阵的行列式为：" + determinant);

        scanner.close();
    }

    public static int calculateDeterminant(int[][] matrix, int n) {
        if (n == 1) {
            return matrix[0][0];
        }

        int determinant = 0;
        int sign = 1;
        for (int i = 0; i < n; i++) {
            int[][] subMatrix = new int[n - 1][n - 1];
            getCofactor(matrix, subMatrix, 0, i, n);
            determinant += sign * matrix[0][i] * calculateDeterminant(subMatrix, n - 1);
            sign = -sign;
        }

        return determinant;
    }

    public static void getCofactor(int[][] matrix, int[][] subMatrix, int row, int col, int n) {
        int i = 0, j = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r != row && c != col) {
                    subMatrix[i][j++] = matrix[r][c];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
}
