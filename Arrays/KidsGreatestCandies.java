import java.util.Arrays;

public class KidsGreatestCandies {
    public static void main(String[] args) {
        int[] candie = { 1, 5, 4, 3, 2 };
        int n = 2;
        int len = candie.length;
        String[] temp = new String[len];
        int index = 0;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int kid = candie[index] + n;
            for (int j = 0; j < len; j++) {
                if (kid >= candie[j]) {
                    sum += 1;
                } else {
                    sum += 0;
                }
            }
            if (sum == len) {
                temp[i] = "true";
            } else {
                temp[i] = "false";
            }
            index++;
            sum = 0;
        }

        System.out.println(Arrays.toString(temp));

    }
}
