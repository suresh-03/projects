package BinarySearch;

import java.util.Arrays;

/*
 * Given an array of integers nums sorted in non-decreasing order,
 *  find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

example:-
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
   Output: [3,4]
 */


public class FindFirstAndLastElementIndex {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int target = 9;
        System.out.println(Arrays.toString(searchRange(arr, target)));;
    }
    public static int[] searchRange(int[] nums,int target){
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        
       
        return ans;
    }

    static int search(int[] nums, int target, boolean startIndex){
        int start = 0;
        int end = nums.length - 1;
        int ans = 0;

        while(start <= end){
            int mid = (start + end) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans =  mid;
                if(startIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
