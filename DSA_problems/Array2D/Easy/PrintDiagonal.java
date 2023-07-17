package DSA_problems.Array2D.Easy;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/print-diagonally4331/1

public class PrintDiagonal{
    public static void main(String[] args) {
      int arr[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };

        System.out.println(downwardDiagonal(3, arr));

    }
    static ArrayList<Integer> downwardDiagonal(int N, int A[][])
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int row = 0,col = i;
            while(col>=0){
                ans.add(A[row][col]);
                row++;
                col--;
            }
        }
        for(int j = 1; j < N; j++){
            int row = j, col = N-1;
            while(row < N){
                ans.add(A[row][col]);
                row++;
                col--;
            }
        }
        return ans;
        // code here 
    }

}