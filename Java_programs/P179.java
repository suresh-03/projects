import java.util.*;

public class P179 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int j = n - 2;

        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[j]) {
                arr[j] = arr[i];
            }
            j--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
