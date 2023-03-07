package BinarySearch;

public class FindCeil {
    public static void main(String[] args) {
     //  int[] arr = {1,2,3,4,5,6,7,8,9,10,11,23,67,89,90};
        int[] arr1 = {99,87,67,54,48,35,27,20,18,13,10,8,7,5,3,2,1};
        int target = 100;
        System.out.println(Ceil(arr1, target));
    }
    public static int Ceil(int[] arr, int t){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[0] < arr[arr.length - 1];
        
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == t){
                return mid;
            }
            if(isAsc){
                if(t < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(t < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        if(isAsc){
            return start;
        }
        else{
            return end;
        }
       
    }
}
