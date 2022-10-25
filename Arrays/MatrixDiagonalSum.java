public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 }
        };

        int solution = diagonalSum(matrix);
        System.out.println(solution);

    }

    public static int diagonalSum(int[][] mat) {

        int sum = 0;
        int center = mat.length / 2;
        int k = mat.length - 1;

        if (mat.length % 2 != 0) {
            sum += mat[center][center];
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[row].length; col++) {
                    if (row == col && row != center && col != center) {
                        sum += mat[row][col];
                    } else if (col == k && row != center && col != center) {
                        sum += mat[row][col];
                    }
                }
                k--;
            }
        } else {
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[row].length; col++) {
                    if (row == col) {
                        sum += mat[row][col];
                    } else if (col == k) {
                        sum += mat[row][col];
                    }
                }
                k--;
            }
        }

        return sum;
    }

}
