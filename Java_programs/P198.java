import java.util.*;

public class P198 {
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

        int m = in.nextInt();

        result(n, arr, m);
    }

    public static void result(int n, int[] arr, int m) {
        int num = m;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                if (i == 0) {
                    for (int j = i; j < n - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                } else if (i == (n - 1)) {
                    for (int j = i; j > 0; j++) {
                        arr[j] = arr[j - 1];
                    }
                } else {
                    for (int j = i; j < n - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                }
                count++;
            }
        }

        if (count == 0) {
            System.out.print(-1);
        } else {
            for (int i = 0; i < (n - 1); i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
