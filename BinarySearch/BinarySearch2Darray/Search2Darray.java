import java.util.Arrays;

// in this array the row also sorted in ascending order and column also sorted in ascending order


public class Search2Darray{
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {21,22,32,42},
            {31,32,33,43}
        };

        int target = 43;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] mat, int target){
        int row = 0;
        int col = mat[row].length - 1;

        while(row < mat.length && col >= 0){
            if(mat[row][col] == target){
                return new int[]{row,col};
            }
            if(mat[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}