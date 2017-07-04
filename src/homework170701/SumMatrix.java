package homework170701;

import datagenerator.MatrixGenerator;

public class SumMatrix {

    public static void main(String[] args) {

        int[][] matrix = MatrixGenerator.matrixGenerate();

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

}
