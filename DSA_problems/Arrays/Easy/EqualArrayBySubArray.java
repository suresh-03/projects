package DSA_problems.Arrays.Easy;

// https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/

public class EqualArrayBySubArray {
    public static void main(String[] args) {
        System.out.println(canBeEqual(new int[]{3,6},new int[]{3,1}));
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        int count = 0;
      
        if(target.length != arr.length){
            return false;
        }
        int left = 0;
        int right = 0;
        while(left < target.length && right < arr.length){
            if(target[left] != arr[right]){
                right++;
            }
            else{
                reverse(arr, left, right);
                if(arr[left] == target[left]){
                left++;
                right = left;
                count++;
                }
            }
        }
        if(count==arr.length){
            return true;
        }
        return false;
    }
    public static int[] reverse(int[] arr, int start, int end){
        int s = start;
        int e = end;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
        
    }
    
}
