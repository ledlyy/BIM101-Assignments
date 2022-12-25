package src;
import java.util.Random;
//İbrahim Yaşin 30922193818
public class Assignment5 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(getRandomSize());
        System.out.println("Matrix: ");
        printMatrix(matrix);
        System.out.println("Diagonal Sum of the Matrix: " + computeSum(matrix));
    }

    public static int getRandomSize() {
        Random r = new Random();
        return r.nextInt(10) + 1;
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = r.nextInt(20) + 1;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int computeSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }
}
