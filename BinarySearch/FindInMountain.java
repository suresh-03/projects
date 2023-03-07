package BinarySearch;

// leetcode - 1095

// https://leetcode.com/problems/find-in-mountain-array/

public class FindInMountain {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,2,1};
        int target = 4;

        System.out.println(find(arr, target));
    }
    static int binary(int[] arr){
        int start = 0;
        int end = arr.length - 1;
    
        while(start < end){
            int mid = (start + end ) / 2;
    
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
           
        }
        return start; // or return end; both are pointing to same element which is maximum
       }
    static int find(int[] arr, int target){
        int start = 0;
      int end = binary(arr);
     
     int a = search(arr, target, start, end);
     if(a != -1){
        return a;
     }
        return search(arr, target, binary(arr) + 1, arr.length - 1 );
     
    }
    static int search(int[] arr, int target,int start,int end){
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
