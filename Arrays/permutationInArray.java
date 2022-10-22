import java.util.Arrays;

public class permutationInArray {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        int len = arr.length;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            ans[i] = arr[arr[i]];
        }

        System.out.println(Arrays.toString(ans));
    }
}
