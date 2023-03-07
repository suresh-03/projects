package BinarySearch;

// leetcode - 410
// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArray {

    public static void main(String[] args) {
       int[] arr = {7,2,5,10,8};
       int m = 2;
       System.out.println(splitArray(arr, m)); 
    }
  public static int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for(int i= 0; i < nums.length; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while(start < end){
            int mid = (start + end) / 2;
            int pieces = 1;
            int sum = 0;
            
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }

        return start;
    }   
}
