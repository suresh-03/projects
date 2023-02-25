package Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDissappearedNumber {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> nums = new ArrayList<>();

        int i = 0;

        while(i != arr.length){
            if(arr[i] - 1 != i && arr[i] != arr[arr[i] - 1]){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
       }

       for(int j = 1; j <= arr.length; j++){
        if(j != arr[j - 1]){
            nums.add(j);
        }
       }



        return nums;
        
     
    }
}
