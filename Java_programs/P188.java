import java.util.*;

public class P188 {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        result(n, arr);
    }

    public static void result(int n, int[] arr) {
        int k = 1;
        int l = 0;
        int sum = 0;

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
        while (true) {
            if (arr[l] > 0) {
                sum = arr[l] + arr[l + 1];
                break;
            }
            l++;
        }

        System.out.print(sum);
    }
}
