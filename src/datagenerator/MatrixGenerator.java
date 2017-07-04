package datagenerator;

import java.util.Random;

public class MatrixGenerator {
    public static int[][] matrixGenerate() {

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