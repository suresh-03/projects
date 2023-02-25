

// https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {

        int leftsum = 0;
        int rightsum = 0;

        for(int i = 0; i < nums.length; i++){
            for(int left = 0; left < i; left++){
                leftsum += nums[left];
            }
            for(int right = i + 1; right < nums.length; right++){
                rightsum += nums[right];
            }
            if(leftsum == rightsum){
                return i;
            }
            rightsum = 0;
            leftsum = 0;
        }
        return -1;
    }
}
