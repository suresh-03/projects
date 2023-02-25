package Recursion.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(search(arr, 7, 0, arr.length - 1));
    }
    static int search(int arr[], int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = (start + end) / 2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid - 1);
    }
}
