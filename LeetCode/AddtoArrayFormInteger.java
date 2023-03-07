import java.util.*;

public class AddtoArrayFormInteger {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(arr, 1));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr = new ArrayList<>(3);
        ArrayList<Integer> result = new ArrayList<>(3);

        int len = num.length - 1;

        while (len >= 0 || k != 0) {
            if (len >= 0) {
                k += num[len];
                len--;
            }

            arr.add(k % 10);
            k /= 10;
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            result.add(arr.get(i));
        }

        return result;
    }
}
