import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 2, 3 };
        int len = arr.length;
        int count = 0;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }

        System.out.println(Arrays.toString(result));
    }
}
