import java.util.Arrays;

public class array2DInMethod {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9, 10 }
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        changeArray(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    static void changeArray(int[][] array) {
        array[0][0] = 5;
    }
}
