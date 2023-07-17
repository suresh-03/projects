package LinearSearch;

import java.util.Arrays;

public class linearSearch2Darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5},
            {6}
        };

        int target = 9;
        System.out.println(search(arr, target));
       System.out.println(Arrays.toString(searchi(arr, target)));
    }
    static boolean search(int[][] arr, int target){
        if(arr.length == 0){
            return false;
        }
        else{
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    if(arr[i][j] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static int[] searchi(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
