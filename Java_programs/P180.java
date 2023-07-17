import java.util.*;

public class P180 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int j = n - 1;

        if (arr.length % 2 == 0) {
            for (int i = 0; i < (arr.length / 2); i++) {
                int ans = arr[i] + arr[j];
                System.out.print(ans + " ");
                j--;
            }
        } else {
            for (int i = 0; i <= (arr.length / 2); i++) {
                int ans = arr[i] + arr[j];
                System.out.print(ans + " ");
                j--;
            }
        }
    }
}
