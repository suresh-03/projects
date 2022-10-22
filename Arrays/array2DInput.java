import java.util.Arrays;
import java.util.Scanner;

public class array2DInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("enter the number for [" + row + "][" + col + "]:");
                matrix[row][col] = in.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
