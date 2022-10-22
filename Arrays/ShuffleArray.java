import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int len = arr.length;
        int n = len / 2;
        int[] temp = new int[len];
        int k = 1;
        int j = 1;

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                temp[i] = arr[i];
            }

            else if (i % 2 == 0) {
                temp[i] = arr[i - j];
                j++;
            } else {
                temp[i] = arr[i + (n - k)];
                k++;
            }
        }

        for (int i = 0; i < len; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
