import java.util.ArrayList;

public class ArrayForm {
    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        ArrayList<Integer> result = addToArrayForm(num, k);
        System.out.println(result);
    }

    public static ArrayList<Integer> addToArrayForm(int[] num, int k) {

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
