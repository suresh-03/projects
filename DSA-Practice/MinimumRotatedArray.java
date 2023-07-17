public class MinimumRotatedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{12,10,9,8,7,1,2,3,4,5}));
    }
      public static int findMin(int[] nums) {
        int start = 0,end = nums.length-1;
        while(start < end){
            int mid = (start + end)/2;

            if(nums[mid] > nums[start] && nums[mid] > nums[end]){
                start = mid + 1;
            }
            else if(nums[mid] < nums[start] && nums[mid] > nums[end]){
                start = mid + 1;
            }
            else if(nums[mid] <= nums[start] && nums[mid] < nums[end]){
                end = mid;
            }
             else if(nums[mid] <= nums[start] && nums[mid] > nums[end]){
                start = mid+1;
            }
            else if(nums[mid] >= nums[start] && nums[mid] < nums[end]){
                end = mid - 1;
            }
        }

        return nums[start];
    }
}
