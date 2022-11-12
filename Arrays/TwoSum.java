import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 7 };
        int target = 10;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i != j) {
                    int temp = nums[i] + nums[j];
                    if (temp == target) {
                        arr[0] = i;
                        arr[1] = j;
                        break;
                    }
                }
            }
        }

        return arr;
    }
}
