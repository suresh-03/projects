import java.util.Arrays;

public class concatinationInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int lenArr = arr.length;
        int lenAns = 2 * lenArr;
        int[] ans = new int[lenAns];

        for (int i = 0; i < lenAns; i++) {
            if (i >= lenArr) {
                ans[i] = arr[i - lenArr];
            } else {
                ans[i] = arr[i];
            }

        }
        System.out.println(Arrays.toString(ans));
    }
}
