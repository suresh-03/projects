package BinarySearch;

public class FindElementInfiniteArray {
   public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
     int target = 15;
     System.out.println(search(arr, target));
   }
   public static int search(int[] arr, int target){
    int x = 2;
    int s = 0;
    int e = x - 1;
    int start = s;
    int end = e;
    int ans = -1;

    while(ans <= -1){
        if(target <= arr[end]){
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
        }
      
        x *= 2;
        s = e + 1; 
        e = x - 1;
        start = s;
        end = e;
    }

    return ans;
  
   } 
}
