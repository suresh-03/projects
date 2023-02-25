import java.util.*;

public class P183 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = 1;

        for (int i = 0; i < n; i++) {
            for (int j = k; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            k++;
        }

        int j = n - 1;

        if (n % 2 == 0) {
            for (int i = 0; i < (n / 2); i++) {
                System.out.print(arr[i] + " " + arr[j] + " ");
                j--;
            }
        } else {
            for (int i = 0; i <= (n / 2); i++) {
                System.out.print(arr[i] + " " + arr[j] + " ");
                j--;
            }
        }
    }
}
