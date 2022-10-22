import java.util.Arrays;

public class shuffleArray2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int len = arr.length;
        int n = len / 2;
        int[] x = new int[n];
        int[] y = new int[n];
        int j = 0;
        int k = 0;

        for (int i = 0; i < n; i++) {
            x[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            y[i] = arr[i + n];
        }

        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                arr[i] = x[j];
                j++;
            } else {
                arr[i] = y[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
