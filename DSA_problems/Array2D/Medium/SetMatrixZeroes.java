package DSA_problems.Array2D.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/set-matrix-zeroes/

public class SetMatrixZeroes {
   public static void main(String[] args) {
    int[][] arr = {
        {1,1,1},
        {1,0,1},
        {1,1,1}
    };
    setZeroes(arr);
   }
   public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        
        int count = 0;
        int idxr = 0;
        int idxc= 0;
        while(count < r.size()){
            int row = r.get(idxr);
            int col = c.get(idxc);
            for(int i = 0; i < matrix[row].length; i++){
                matrix[row][i] = 0;
            }
            for(int j = 0; j < matrix.length; j++){
                matrix[j][col] = 0;
            }
            count++;
            idxc++;
            idxr++;
        }
    
        
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        
   } 
}
