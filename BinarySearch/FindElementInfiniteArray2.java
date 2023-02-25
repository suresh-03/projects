package BinarySearch;

public class FindElementInfiniteArray2 {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 160;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int tempstart = end + 1;
           int tempend = end + (end - start + end) * 2;
           start = tempstart;
           end = tempend;
        }
        return binary(arr, target, start, end);
    }
    static int binary(int[] arr, int target,int start, int end){

        int ans = 0;
        while(start <= end){
            int mid = (start + end) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                ans = mid;
                break;
            }
        }
        return ans;
    }
}
