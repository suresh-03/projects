import java.util.*;

public class P193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();

        result(n, arr, m);

    }

    public static void result(int n, int[] arr, int m) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                arr[i] = arr[i - 1];
            } else {
                arr[i] = m;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
