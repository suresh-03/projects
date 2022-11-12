import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {

        int[][] matrix = {
                { 0, 1 }
        };

        int[][] target = {
                { 1, 0 }
        };

        System.out.println(findRotation(matrix, target));

    }

    public static boolean findRotation(int[][] mat, int[][] target) {

        if (mat == target) {
            return true;
        }
        int n = mat.length;
        int[][] rot90 = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                rot90[i][j] = mat[n - 1 - j][i];
            }
        }

        int[][] rot180 = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                rot180[i][j] = rot90[n - 1 - j][i];
            }
        }

        int[][] rot270 = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                rot270[i][j] = rot180[n - 1 - j][i];
            }
        }

        if (Arrays.deepEquals(mat, target) || Arrays.deepEquals(rot90, target) ||
                Arrays.deepEquals(rot180, target)
                || Arrays.deepEquals(rot270, target)) {
            return true;
        }

        return false;
    }
}
