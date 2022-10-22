import java.util.Arrays;

public class arrayIn2D {
    public static void main(String[] args) {
        // int[][] matrix = new int[4][];
        // here first bracket is row and 2nd is column
        // here row is mandatory and column not mandatory can be more columns exist

        // here the 2d array index is for each row in array
        int[][] matrix = {
                { 1, 2, 3 }, // index 0
                { 4, 5, 6 }, // index 1
                { 7, 8, 9 }// index 2
        };

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));

    }
}
