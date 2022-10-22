import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 9, 9 },
                { 5, 6, 7 },
                { 8, 9, 5 }
        };
        int len = arr.length;
        int[] ans = new int[3];
        int sum = 0;
        int max = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            ans[i] = sum;
            sum = 0;
        }
        for (int i = 0; i < len; i++) {
            if (ans[i] > max) {
                max = ans[i];
            }
        }

        System.out.println(max);

        System.out.println(Arrays.toString(ans));
    }
}
