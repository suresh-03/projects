import java.util.Arrays;

public class ProductOfArrayNoSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf1(arr)));
    }
    // O(n^2)
    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int mul = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    mul *= nums[j];
                }
            }
            arr[i] = mul;
        }
        return arr;
    }
    // O(n)
    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        
        arr[0] = 1;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i-1] * nums[i-1];
        }
        int r = 1;
        for(int i = n-1; i >= 0; i--){
            arr[i] *= r;
            r *= nums[i];
        }
 
        return arr;
    }
}
