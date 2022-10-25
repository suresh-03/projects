import java.util.Arrays;

public class CellsWithOddValues {
    public static void main(String[] args) {
        int[][] index = {
                { 0, 1 },
                { 1, 1 },
        };
        int result = oddCells(2, 3, index);
        System.out.println(result);

    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }

        for (int row = 0; row < indices.length; row++) {
            for (int col = 0; col < indices[row].length; col++) {
                int temp = indices[row][col];
                if (col % 2 == 0) {
                    for (int rowArr = 0; rowArr < arr[0].length; rowArr++) {
                        arr[temp][rowArr] += 1;
                    }
                } else {
                    for (int colArr = 0; colArr < arr.length; colArr++) {
                        arr[colArr][temp] += 1;
                    }
                }

            }
        }

        int result = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] % 2 != 0) {
                    result += 1;
                }
            }
        }

        return result;
    }

}
