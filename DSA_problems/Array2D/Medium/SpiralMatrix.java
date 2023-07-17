package DSA_problems.Array2D.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
         {1,2,3},
         {4,5,6},
         {7,8,9},
         {10,11,12},
         {13,14,15}
        };
  
        System.out.println(spiral(arr));
    }
   
    static List<Integer> spiral(int[][] arr){
        int rl = 0;
        int rh = arr.length - 1;
        int cl = 0;
        int ch = arr[rl].length - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        if(arr.length == 1){
            for(int i = 0; i < arr[0].length; i++){
               ans.add(arr[0][i]);
            }
        }
        else if(arr[0].length == 1){
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                   ans.add(arr[i][j]);
                }
            }
        }
        else{
            while(rl <= rh && cl <= ch){
                for(int i = cl; i <= ch; i++){
                    ans.add(arr[rl][i]);
                }
                rl++;
                for(int j = rl; j <= rh; j++){
                    ans.add(arr[j][ch]);
                }
                ch--;
                if(rl > rh || cl > ch){
                    break;
                }
                for(int k = ch; k >= cl; k--){
                    ans.add(arr[rh][k]);
                }
                rh--;
                for(int l = rh; l >= rl; l--){
                    ans.add(arr[l][cl]);
                }
                cl++;   
            }
        }
        return ans;    
        }
}


