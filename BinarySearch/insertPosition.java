package BinarySearch;

// https://leetcode.com/problems/search-insert-position/

public class insertPosition{
    public static void main(String[] args) {
        int[] arr = {1,3};
        int target = 0;
        System.out.println(searchInsert(arr,target));
    }
    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
            
        }

        return start;

    }
}