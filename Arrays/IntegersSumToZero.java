import java.util.Arrays;

public class IntegersSumToZero {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        int start = 0;
        int end = n - 1;

        while (start < end) {
            ans[start] = start + 1;
            ans[end] = ans[start] * (-1);
            start++;
            end--;
        }

        return ans;
    }
}
