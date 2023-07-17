package Easy;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{5,1,3}, 5));
    }
    static int search(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        while( s <= e){
            int m = (s + e)/2;
            if(arr[m] == target){
                return m;
            }
            if(arr[m] > arr[s] && target < arr[m] && target > arr[s]){
                e = m - 1;
            }
            else if(arr[m] < arr[s] && target > arr[m] && target < arr[s]){
                s = m + 1;
            }
            else{
                s = m + 1;
            }
        }
        return -1;
    }
}
