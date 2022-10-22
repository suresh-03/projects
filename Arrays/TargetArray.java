import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, };
        int len = arr.length;
        int[] index = { 0, 1, 2, 2, 1 };
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            if (i == index[i]) {
                result[index[i]] = arr[i];
            }

            else {
                int max = Math.max(i, index[i]);
                int min = Math.min(i, index[i]);

                for (int j = max; j > min; j--) {
                    result[j] = result[j - 1];
                }
                result[min] = arr[i];
            }

        }

        System.out.println(Arrays.toString(result));
    }
}