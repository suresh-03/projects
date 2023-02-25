import java.util.Scanner;

public class P128 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int[] arr = new int[9];

        int a = 3;
        int k = n1;
        int i = 0;
        int ans = 1;

        while (a != 0) {
            while (k != 0) {
                int num = k % 10;
                arr[i] = num;
                k /= 10;
                i++;
            }
            a--;
            if (a == 2) {
                k = n2;
            } else {
                k = n3;
            }

        }

        int min1 = arr[0];
        if (arr[3] < min1) {
            min1 = arr[3];
        }
        if (arr[6] < min1) {
            min1 = arr[6];
        }

        int min2 = arr[1];
        if (arr[4] < min2) {
            min2 = arr[4];
        }
        if (arr[7] < min2) {
            min2 = arr[7];
        }

        int min3 = arr[2];
        if (arr[5] < min3) {
            min3 = arr[5];
        }
        if (arr[8] < min3) {
            min3 = arr[8];
        }

        int max = arr[0];
        for (int j = 0; j < 9; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }

        ans = (1000 * max) + (100 * min3) + (10 * min2) + min1;

        System.out.print(ans);
    }
}
