import java.util.Arrays;
import java.util.Scanner;

import javax.swing.RowFilter;

public class AdditionIn2Darray {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("enter no of rows:");
            int row = in.nextInt();
            System.out.print("enter no of colomns:");
            int col = in.nextInt();
            int[][] matrix1 = new int[row][col];
            int[][] matrix2 = new int[row][col];
            int[][] addMatrix = new int[row][col];

            mat1(matrix1);
            mat2(matrix2);
            addmat(matrix1, matrix2, addMatrix);
        }
    }

    static int[][] mat1(int[][] meMat1) {
        System.out.println("Matrix 1:-");
        try (Scanner in1 = new Scanner(System.in)) {
            for (int i = 0; i < meMat1.length; i++) {
                for (int j = 0; j < meMat1[i].length; j++) {
                    System.out.print("enter mat1[" + i + "][" + j + "]: ");
                    meMat1[i][j] = in1.nextInt();
                }
            }
        }
        return meMat1;
    }

    static int[][] mat2(int[][] meMat2) {
        System.out.println("Matrix 2:-");
        try (Scanner in2 = new Scanner(System.in)) {
            for (int i = 0; i < meMat2.length; i++) {
                for (int j = 0; j < meMat2[i].length; j++) {
                    System.out.print("enter mat2[" + i + "][" + j + "]: ");
                    meMat2[i][j] = in2.nextInt();
                }

            }
        }
        return meMat2;
    }

    static void addmat(int[][] m1, int[][] m2, int[][] result) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        for (int a = 0; a < result.length; a++) {
            System.out.print(Arrays.toString(result[a]));
            System.out.println();
        }

    }
}
