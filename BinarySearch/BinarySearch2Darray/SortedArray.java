import java.util.Arrays;

public class SortedArray {
  public static void main(String[] args) {
    int[][] arr = {
        { 1 , 3, 5,7 },
        {10,11,16,20},
        {23,30,34,60}
       
    };
    int target = 3;
    System.out.println(searchMatrix(arr, target));
  }

  public static boolean searchMatrix(int[][] arr, int target) {
    
    int[] arr1 = new int[arr[0].length];

    int start = 0;
    int end = arr[start].length - 1;
    while(start < arr.length && end >= 0){
        if(arr[start][end] == target){
            return true;
        }
        if(arr[start][end] < target){
            start++;
        }
        else{
          for(int i = 0; i < arr[start].length; i++){
            arr1[i] = arr[start][i];
          }
          return  binarysearch(arr1, target, 0,end);
        }
    }
    return false;
}

public static boolean binarysearch(int arr[], int target, int start, int end){
while(start <= end){
    int mid = (start + end) / 2;
    if(arr[mid] < target){
        start = mid + 1;
    }
    else if(arr[mid] > target){
        end = mid - 1;
    }
    else{
        return true;
    }
}
return false;
}
}
