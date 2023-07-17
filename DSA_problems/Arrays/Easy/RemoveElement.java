package DSA_problems.Arrays.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/remove-element/

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int len = nums.length;
        int i = 0;
        while(i < len){
            if(nums[i] == val){
                count++;
                for(int j = i; j < nums.length; j++){
                    if(j < nums.length-1){
                    nums[j] = nums[j+1];
                    }
                }
                nums[nums.length-1] = -1;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-count;
    }
}
