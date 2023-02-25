package Sorting.CyclicSort;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int k = 0;
        int len = nums.length;
      
        
        while(k < nums.length){
            if(k != nums[k] && nums[k] < nums.length){
                int temp = nums[nums[k]];
                nums[nums[k]] = nums[k];
                nums[k] = temp;
            }
            else{
                k++;
            }
           
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }


             
     


      return nums[len - 1] + 1;
      
    }
}
