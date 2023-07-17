public class SearchRotatedArray {
public static void main(String[] args) {
    System.out.println(search(new int[]{3,1}, 1));
}
public static int search(int[] nums, int target) {
    int pivot = findMax(nums);
    if(pivot != nums.length-1){
        if(nums[pivot] == target){
            return pivot;
        }
        else if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        else{
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }
    }
    else{    
     return binarySearch(nums, target, 0, nums.length-1);
    }
}
public static int findMax(int[] nums){
    int start = 0,end = nums.length-1;
    while(start < end){
        int mid = (start + end)/2;
        if(nums[mid] >= nums[start] && nums[mid] > nums[end] && nums[mid] > nums[mid+1]){
            end = mid;
        }
        else if(nums[mid] >= nums[start] && nums[mid] < nums[end]){
            start = mid + 1;
        }
        else if(nums[mid] >= nums[start] && nums[mid] > nums[end] && nums[mid] < nums[mid + 1]){
            start = mid + 1;
        }
        else if(nums[mid] < nums[start] && nums[mid] <= nums[end]){
            end = mid - 1;
        }
    }
    return start;
}
public static int binarySearch(int[] nums,int target,int start, int end){
    while(start <= end){
        int mid = (start + end)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }
    return -1;
}
}
