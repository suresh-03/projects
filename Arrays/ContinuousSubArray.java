public class ContinuousSubArray {
    public static void main(String[] args) {
        int[] nums = { 23, 2, 6, 4, 7 };
        int k = 6;

        System.out.println(checkSubarraySum(nums, k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {

        int ind1 = 1;
        int index = ind1;
        int ind = 0;

        for (int i = 0; i < nums.length; i++) {
            int total = nums[ind];
            for (int j = index; j < nums.length; j++) {
                total += nums[j];
                if (total % k == 0) {
                    return true;
                }
                index++;
            }
            ind++;
            ind1++;
            index = ind1;

            total = 0;
        }

        return false;
    }
}
