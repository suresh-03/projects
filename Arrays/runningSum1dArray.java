import java.util.Arrays;

public class runningSum1dArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1 };
        int len = arr.length;
        int[] ans = new int[len];
        int sum = 0;

        for (int i = 0; i < len; i++) {
            sum += arr[i];
            ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}
