package homework170701;

import java.util.Random;

public class SumMatrix {

    public static void main(String[] args) {

        int[][] matrix = matrixGenerate();

        matrixSum(matrix);

    }

    private static void matrixSum(int[][] matrix) {

        INNER: for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) continue INNER;
                sum += matrix[i][j];
            }
            System.out.println("i: " + i + ", sum = " + sum);
        }

    }

    private static int[][] matrixGenerate() {

        Random random = new Random();

        int[][] matrix = new int[random.nextInt(10) + 1][random.nextInt(10) + 1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(30) - 10;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

}
